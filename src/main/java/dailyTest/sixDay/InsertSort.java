package dailyTest.sixDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-26
 * Time: 上午12:46
 * To change this template use File | Settings | File Templates.
 */
public class InsertSort {
    public static void insertSort(int[] a){
        int len=a.length;
        int j;
        int temp=0;
        for(int i=1;i<len;i++){
            temp=a[i];
            j=i-1;
            for(;j>=0&&a[j]>temp;j--){
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
    }
}
