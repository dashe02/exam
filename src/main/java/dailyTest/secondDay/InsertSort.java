package dailyTest.secondDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 上午8:59
 * To change this template use File | Settings | File Templates.
 */
public class InsertSort {
    public static void insertSort(int[] a){
        int temp=0;
        int j;
        for(int i=1;i<a.length;i++){
            temp=a[i];
            j=i-1;
        for(;j>=0&&temp<a[j];j--){
            a[j+1]=a[j];
        }
            a[j+1]=temp;
        }
    }

    public static void main(String[] args){
        int[] a={1,4,5,7,0,3,2};
        insertSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
