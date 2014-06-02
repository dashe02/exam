package structure.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-30
 * Time: 下午10:27
 * To change this template use File | Settings | File Templates.
 */
public class ShellSort {
     public static void shellSort(int[] data){
        int j;
        int len=data.length;
         for(int val=len>>1;val>0;val>>=1){
             for(int i=0;i<val;i++){
                 int temp=data[i];
                 for(j=i;j>=val&&temp<data[j-val];j-=val){
                     data[j]=data[j-val];
                 }
                 data[j]=temp;
             }
         }
     }
     public static void main(String[] args){
         int[] a={1,5,2,9,0,19};
         shellSort(a);
         for(int i=0;i<a.length;i++){
             System.out.println(a[i]);
         }
     }
}
