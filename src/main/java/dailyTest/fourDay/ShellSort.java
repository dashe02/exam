package dailyTest.fourDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-14
 * Time: 下午12:49
 * To change this template use File | Settings | File Templates.
 */
public class ShellSort {
    public static void shellSort(int[] a){
        int j;
        int len=a.length;
        for(int val=len>>1;val>0;val>>=1){
         for(int i=val;i<len;i++){
             int temp=a[i];
             for(j=i;j>=val&&a[j-val]>temp;j-=val){
                 a[j]=a[j-val];
             }
             a[j]=temp;
         }
        }
    }
    public static void main(String[] args){
        int[] a={1,3,7,9,0,5,4};
        shellSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
