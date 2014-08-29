package algorithm.exist.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午8:06
 * To change this template use File | Settings | File Templates.
 */
public class HeapSort {
    public static void heapSort(int[] a){
           buildHeap(a);
           int n=a.length;
           int i;
          for(i=n-1;i>=0;i--){
              swap(a,0,i);
              heapify(a,0,i);
          }
    }
    public static void buildHeap(int[] a){
          int n=a.length;
          int i;
          for(i=n/2-1;i>=0;i--){
            heapify(a,i,n);
          }
    }
    public static void heapify(int[] a,int ids,int max){
         int left=ids*2+1;
         int right=ids*2+2;
         int largest=0;
         if(left<max&&a[left]>a[ids])
            largest=left;
        else
             largest=ids;
        if(right<max&&a[right]>a[largest])
            largest=right;
        if(largest!=ids){
           swap(a,largest,ids);
           heapify(a,largest,max);
        }
    }
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
