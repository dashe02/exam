package dailyTest.firstDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-7
 * Time: 上午10:34
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort1 {
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
          int[] tmp=new int[a.length];
          int r1=mid+1;
          int tIndex=left;
          int cIndex=left;
          while(left<=mid&&r1<=right){
              if(a[left]<a[r1])
                  tmp[tIndex++]=a[left++];
              else
                  tmp[tIndex++]=a[r1++];
          }
        while(left<=mid){
            tmp[tIndex++]=a[left++];
        }
        while(r1<=right){
            tmp[tIndex++]=a[r1++];
        }
        while(cIndex<=right){
            a[cIndex]=tmp[cIndex];
            cIndex++;
        }
    }
    public static void main(String[] args){
        int[] a={1,5,3,9,0,6};
        mergeSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
