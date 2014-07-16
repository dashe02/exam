package dailyTest.fourDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-14
 * Time: 上午11:54
 * To change this template use File | Settings | File Templates.
 */
public class InsertSort {
    public static void insertSort(int[] a){
        int temp=0;
        int j;
        int len=a.length;
        for(int i=1;i<len;i++){
            temp=a[i];
            j=i-1;
            for(;j>=0&&a[j]>temp;j--){
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
    }
    public static void main(String[] args){
        int[] a={1,8,5,3,0,2,6};
        insertSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
