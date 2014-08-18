package algorithm.sort.first;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午9:26
 * To change this template use File | Settings | File Templates.
 */
public class ShellSort {
    public static void shellSort(int[] a){
        int len=a.length;
        int j;
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
}
