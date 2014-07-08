package structure;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 上午10:49
 * To change this template use File | Settings | File Templates.
 */
public class HeapSort {

    public static void heapSort(int[] array){
       buildHeap(array);
       int n=array.length;
        int i=0;
        for(i=n-1;i>=1;i--){
            swap(array,0,i);
            heapify(array,0,i);
        }
    }
    public static void buildHeap(int[] array){
          int n=array.length;//数组中的个数
          for(int i=n/2-1;i>=0;i--)
              heapify(array,i,n);
    }
    public static void heapify(int[] A,int idx,int max){
        int left=2*idx+1;  //左孩子的下标
        int right=2*idx+2;  //右孩子的下标
        int largest=0;      //寻找3个节点中最大值节点的下标
        if(left<max&&A[left]>A[idx])
            largest=left;
        else
            largest=idx;
        if(right<max&&A[right]>A[largest])
            largest=right;
        if(largest!=idx){
            swap(A,largest,idx);
            heapify(A,largest,max);
        }
    }
    public static void swap(int[] array,int i,int j){
        int temp=0;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,16,9,10,11,12,13,14,15,8};
        System.out.println("排序前..............");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        heapSort(a);
        System.out.println();
        System.out.println("排序后.............");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
