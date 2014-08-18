package algorithm.sort.first;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午9:08
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort {
    public static void quickSort(int[] a){
           if(a.length>0){
               quick(a,0,a.length-1);
           }
    }
    public static void quick(int[] a,int low,int high){
           if(low<high){
               int middle=getMiddle(a,low,high);
               quick(a,low,middle);
               quick(a,middle+1,high);
           }
    }
    public static int getMiddle(int[] a,int low,int high){
        int temp=a[low];
        while(low<high){
            while(low<high&&a[high]>temp){
                high--;
            }
            a[low]=a[high];
            while(low<high&&a[low]<temp){
                low++;
            }
            a[high]=a[low];
        }
           a[low]=temp;
          return low;
    }
}
