package dailyTest.firstDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 下午2:54
 * To change this template use File | Settings | File Templates.
 */
public class HeapSort {
    public static void heapSort(int[] a){
            buildHeap(a);
            int n=a.length;
            int i=0;
            for(i=n-1;i>=1;i--)
            {
                swap(a,0,i);
                heapify(a,0,i);
            }
    }
    public static void buildHeap(int[] a){
        int n=a.length;
        for(int i=n/2-1;i>=0;i--)
            heapify(a,i,n);
    }
    public static void heapify(int[] a,int idx,int max){
           int left=2*idx+1;
           int right=2*idx+2;
           int largest=0;
           if(left<max&&a[left]>a[idx])
               largest=left;
           else
               largest=idx;
           if(right<max&&a[right]>a[largest])
               largest=right;
           if(largest!=idx)
           {
               swap(a,largest,idx);
               heapify(a,largest,max);
           }
}
    public static void swap(int[] a,int i,int j){
        int temp=0;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args){
      int[] a={1,2,4,6,8,0,3,9};
      System.out.println("排序之前.......");
      for(int i=0;i<a.length;i++){
          System.out.print(a[i]);
      }
        heapSort(a);
        System.out.println();
      System.out.println("排序之后........");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
