package structure.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-30
 * Time: 下午7:59
 * To change this template use File | Settings | File Templates.
 */
public class SelectSort {
    public static void sort(int[] data){
        //数组长度
        int len=data.length;
        for(int i=0;i<len;i++){
            //记录当前位置
            int position=i;
            //找出最小的数，并用position指向最小的位置
            for(int j=i+1;j<len;j++){
                if(data[position]>data[j]){
                    position=j;
                }
            }
            //交换最小数data[position]和第i位数的位置
            int temp=data[i];
            data[i]=data[position];
            data[position]=temp;
        }
    }
    public static void main(String[] args){
          int[] c={4,9,23,1,45,27,5,2};
          sort(c);
          for(int i=0;i<c.length;i++){
              System.out.println(c[i]);
          }
    }
}
