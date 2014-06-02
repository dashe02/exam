package structure.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 上午9:43
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {
    public static int[]  mergeSort(int[] num,int s,int t,int[] num1){
           int m;
           int[] num2=new int[t+1];
           if(s==t)
               num1[s]=num[s];
           else{
               m=(s+t)/2;
               mergeSort(num,s,m,num2); //左半部分递归调用
               mergeSort(num,m+1,t,num2);//右半部分递归调用
               merge(num2,s,m,t,num1);  //由num2去归并，返回的值放到num1中，num1赋新值,其实就是更新num2，
                                        //然后让num2再去归并,返回新的num1
           }
            return num1;
    }
    //有序表的合并
    public static void merge(int[] num,int l,int m,int n,int[] num1){
        System.out.println("l="+l+"m="+m+"n="+n);
        System.out.println();
        int i,j,k;
        i=l;
        j=m+1;
        k=l;
        while(i<=m&&j<=n){
            if(num[i]<num[j])
                num1[k++]=num[i++];
             else{
                num1[k++]=num[j++];
            }
        }
        while(i<=m){
            num1[k++]=num[i++];
        }
        while(j<=n){
            num1[k++]=num[j++];
        }
    }
    public static void main(String[] args){
        int[] num={51,38,49,27,62,05,16};
        int[] num1=new int[7];
        num=mergeSort(num,0,num.length-1,num1);
        for(int i:num){
            System.out.println(i+"");
        }
    }

}
