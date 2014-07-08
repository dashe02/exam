package dailyTest.secondDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 上午9:15
 * To change this template use File | Settings | File Templates.
 */
public class ShellSort {
    public static void shellSort(int[] a){
        int len=a.length;
        int j;
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
        int[] a={1,6,3,9,0,5};
        shellSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
