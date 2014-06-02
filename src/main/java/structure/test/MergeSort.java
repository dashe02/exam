package structure.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 下午2:38
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {
     public static void mergeSort(int[] a){
       System.out.println("开始排序");
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
    public static void merge(int[] a,int left,int mid,int right)
    {
        int[] temp=new int[a.length];
        int r1=mid+1;
        int tIndex=left;
        int cIndex=left;
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
                System.out.println(a[cIndex]+"\t");
                cIndex++;
            }
            System.out.println();
    }
    public static void main(String[] args){
          int[] a={1,6,9,3,2,0,10};
          mergeSort(a);
          for(int i=0;i<a.length;i++){
              System.out.println(a[i]);
          }
    }
}
