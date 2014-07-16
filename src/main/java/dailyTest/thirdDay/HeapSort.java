package dailyTest.thirdDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-9
 * Time: 上午9:13
 * To change this template use File | Settings | File Templates.
 */
public class HeapSort {
     public static void heapSort(int[] a){
          buildHeap(a);
          int n=a.length;
          int i=0;
          for(i=n-1;i>=1;i--){
              swap(a,0,i);
              heapify(a,0,i);
          }
     }
     public static void buildHeap(int[] a){
          int n=a.length;
          for(int i=n/2-1;i>=0;i--){
             heapify(a,i,n);
          }
     }
     public static void heapify(int[] a,int ids,int max){
        int left=2*ids+1;
        int right=2*ids+2;
        int largest=0;
        if(left<max&&a[left]>a[ids])
            largest=left;
        else
            largest=ids;
        if(right<max&&a[right]>a[largest])
            right=largest;
         if(largest!=ids){
             swap(a,largest,ids);
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
        int[] a={1,4,8,0,5,3};
        heapSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
