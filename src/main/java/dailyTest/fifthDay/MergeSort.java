package dailyTest.fifthDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-18
 * Time: 下午6:06
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {
    public static void mergeSort(int[] a){

    }
    public static void sort(int[] a,int low,int high){
           int mid=(low+high)/2;
           sort(a,low,mid);
           sort(a,mid+1,high);
           merge(a,low,mid,high);
    }
    public static void merge(int[] a,int low,int mid,int high){

    }
}
