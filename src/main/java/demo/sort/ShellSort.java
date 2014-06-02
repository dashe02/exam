package demo.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午12:41
 * To change this template use File | Settings | File Templates.
 */
public class ShellSort {
    public static void shellSort(int[] a){
         int j=0;
         int len=a.length;
         for(int val=len>>1;val>0;val>>=1){
             for(int i=val;i<len;i++){
                 int temp=a[i];
                 for(j=i;j>=val&&temp<a[j-val];j-=val){
                      a[j]=a[j-val];
                 }
                 a[j]=temp;
             }
         }
    }
     public static void main(String[] args){
         int[] a={7,3,0,2,10,9};
         shellSort(a);
         for(int i=0;i<a.length;i++){
             System.out.println(a[i]);
         }
     }
}
