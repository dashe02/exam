package dailyTest.fourDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-14
 * Time: 下午3:18
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {
    public static void main(String[] args){
        int[] a={1,7,9,0,4,3,6};
        mergeSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
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
         int tIndex=left;
         int cIndex=left;
         int r1=mid+1;
         int[] tmp=new int[a.length];
         while(left<=mid&&r1<=right)
         {
             if(a[left]<a[r1])
                 tmp[tIndex++]=a[left++];
             else
                 tmp[tIndex++]=a[r1++];
         }
         while(left<=mid){
               tmp[tIndex++]=a[left++];
         }
         while (r1<=right){
            tmp[tIndex++]=a[r1++];
         }
         while(cIndex<=right){
             a[cIndex]=tmp[cIndex];
             cIndex++;
         }
    }
}
