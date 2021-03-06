package dailyTest.firstDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-7
 * Time: 上午10:08
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {
    public static void mergeSort(int[] a){
           System.out.println("开始排序:");
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
        int[] temp=new int[a.length];
        int tIndex=left;
        int cIndex=left;
        int r1=mid+1;
        while(left<=mid&&r1<=right){
            if(a[left]<=a[r1])
                 temp[tIndex++]=a[left++];
            else
                 temp[tIndex++]=a[r1++];
        }
        while(left<mid){
            temp[tIndex++]=a[left++];
        }
        while (r1<right){
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
        int[] a={2,4,1,7,0,8};
        mergeSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
