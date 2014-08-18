package algorithm.sort.first;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午9:30
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {
    public static void mergeSort(int[] a){
            sort(a,0,a.length-1);
    }
    public static void sort(int[] a,int left,int right){
           if(left>=right)
               return;
           int mid=(left+right)/2;
           sort(a,left,mid);
           sort(a,mid+1,right);
           merge(a,left,mid,right);
    }
    public static void merge(int[] a,int left,int mid,int right){
           int[] temp=new int[a.length];
           int tIndex=left;
           int cIndex=left;
           int r1=mid+1;
           while(left<=mid&&r1<=right){
               if(a[left]<a[r1])
                   temp[tIndex++]=a[left++];
               else
                   temp[tIndex++]=a[r1++];
           }
           while(left<=mid){
               temp[tIndex++]=a[left++];
           }
           while(r1<=right){
               temp[tIndex++]=a[r1++];
           }
           while(cIndex<=right){
               a[cIndex]=temp[cIndex];
               cIndex++;
           }
    }
}
