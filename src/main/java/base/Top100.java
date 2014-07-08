package base;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-29
 * Time: 下午2:33
 * To change this template use File | Settings | File Templates.
 */
public class Top100 {
    //算法实现从一亿数字中获取前100个最大的数字
    /*
    * 原理:把一亿个数字的前100个首先放入数组。然后把最小值放到arr[0]
    * 再循环100到1亿之间的,每次循环判断当前数字是否大于arr[0]
    * 当大于时,当前数字放入arr[0]并再次重构数组最小值进入arr[0]以此类推。
    * 当循环完这一亿个数字后,最大的前100个数字就出来了.
    */
     public static void find(){
           int number=100000000;//一亿个数
           int maxnum=1000000000;//随机最大数
           int i=0;
           int topnum=100;//取最大的多少个
           Date startTime=new Date();
           Random random=new Random();
           int[] top=new int[topnum];
           for(i=0;i<topnum;i++){
              top[i]=Math.abs(random.nextInt(maxnum));
           }
           buildHeap(top,0,top.length);
         for(i=topnum;i<number;i++){
             int currentNumber2=Math.abs(random.nextInt(maxnum));
             if(top[0]<currentNumber2){
                 top[0]=currentNumber2;
                 shift(top,0,top.length,0);
             }
         }
         System.out.println(Arrays.toString(top));
         sort(top);
         System.out.println(Arrays.toString(top));
         Date endTime=new Date();
         System.out.println("用了"+(endTime.getTime()-startTime.getTime())+"毫秒");
     }
     public static int getNum(int i){
         return i;
     }
     //构建排序数组
    public static void buildHeap(int[] array,int from,int len){
        int pos=(len-1)/2;
        for(int i=pos;i>=0;i--){
            shift(array,from,len,1);
        }
    }
    public static void shift(int[] array,int from,int len,int pos){
        int tmp=array[from+pos];
        int index=pos*2+1;    //得到当前pos节点的左节点
        while(index<len)
        {
            if(index+1<len&&array[from+index]>array[from+index+1])//如果存在右节点
            {
                //如果右边节点比左边节点小,就和右边的比较
                index+=1;
            }
            if(tmp>array[from+index]){
                  array[from+pos]=array[from+index];
                  pos=index;
                  index=pos*2+1;
            }else{
                break;
            }
        }
          //最终全部置换完毕后,把临时变量赋给最后的节点
          array[from+pos]=tmp;
    }
    public static void sort(int[] array){
        for(int i=0;i<array.length-1;i++){
            //当前值当做最小值
            int min=array[i];
            for(int j=i+1;j<array.length;j++){
                if(min>array[j]){
                    min=array[j];
                    array[j]=array[i];
                    array[i]=min;
                }
            }
        }
    }
    public static void main(String[] args){
        find();
    }
}
