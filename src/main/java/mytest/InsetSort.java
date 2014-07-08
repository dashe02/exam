package mytest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-6
 * Time: 下午10:57
 * To change this template use File | Settings | File Templates.
 */
public class InsetSort {
     public static void insertSort(int[] a){
        int temp=0;
        int j;
        for(int i=1;i<a.length;i++)
        {
            temp=a[i];
            j=i-1;
            for(;j>=0&&temp<a[j];j--){
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
     }
    public static void main(String[] args){
        int[] a={1,6,2,8,4,0};
        insertSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
