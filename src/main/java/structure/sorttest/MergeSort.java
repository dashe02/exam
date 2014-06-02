package structure.sorttest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 上午11:44
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {
    public static void mergeSort(int[] a){
      System.out.println("开始排序");
      Sort(a,0,a.length-1);
    }
    public static void Sort(int[] a,int left,int right){
        if(left>=right)
            return;
        int mid=(left+right)/2;
        Sort(a,left,mid);
        Sort(a,mid+1,right);
        merge(a,left,mid,right);
    }
    public static void merge(int[] a,int left,int mid,int right){
        int[] tmp=new int[a.length];
        int r1=mid+1;
        int tIndex=left;
        int cIndex=left;
        //逐个归并
        while(left<=mid&&r1<=right){
            if(a[left]<=a[r1])
                tmp[tIndex++]=a[left++];
            else
                tmp[tIndex++]=a[r1++];
        }
        //将左边剩余的归并
        while(left<=mid){
            tmp[tIndex++]=a[left++];
        }
        //将右边剩余的归并
        while(r1<=right){
            tmp[tIndex++]=a[r1++];
        }
        while(cIndex<=right){
            a[cIndex]=tmp[cIndex];
            System.out.println(a[cIndex]+"\t");
            cIndex++;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] a={26,5,98,108,28,99,100,56,34,1};
        mergeSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
