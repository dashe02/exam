package demo.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 上午11:18
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort {
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
    public static void quick_sort(int[] a,int low,int high){
        if(low<high){
            int middle=getMiddle(a,low,high);
            quick_sort(a,low,middle-1);
            quick_sort(a,middle+1,high);
        }
    }
    public static void quick(int[] a){
        if(a.length>0){
            quick_sort(a,0,a.length-1);
        }
    }
    public static void main(String[] args){
        int[] a={6,4,2,1,9,0,10};
        quick(a);
        for(int i=0;i<a.length;i++){
             System.out.println(a[i]);
        }
    }
}
