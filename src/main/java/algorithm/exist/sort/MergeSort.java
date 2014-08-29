package algorithm.exist.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午7:45
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {
     public static void mergeSort(int[] a){
             sort(a,0,a.length-1);
     }
     public static void sort(int[] a,int left,int right){
              if(left>=right)
                  return;
              int middle=(left+right)/2;
              sort(a,left,middle);
              sort(a,middle+1,right);
              merge(a,left,middle,right);
     }
     public static void merge(int[] a,int left,int mid,int right){
            int tIndex=left;
            int cIndex=left;
            int r1=mid+1;
            int[] temp=new int[a.length];
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
