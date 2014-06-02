package structure.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-30
 * Time: 下午7:19
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort {

    public int getMiddle(int[] a,int low,int high){
        int tmp=a[low];
        while(low<high){
            while(low<high&&a[high]>tmp){
                  high--;
            }
            a[low]=a[high];
            while(low<high&&a[low]<tmp){
                  low++;
            }
            a[high]=a[low];
        }
        a[low]=tmp;
        return low;
    }
     public void quick_sort(int[] a,int low,int high){
         if(low<high){
             int middle=getMiddle(a,low,high);
             quick_sort(a,low,middle-1);
             quick_sort(a,middle+1,high);
         }
     }
     public void quick(int[] a){
          if(a.length>0){
              quick_sort(a,0,a.length-1);
          }
    }
    public static void main(String[] args){
        QuickSort quickSort=new QuickSort();
        int[] a={34,3,53,2,23,7,14,10};
        quickSort.quick(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
