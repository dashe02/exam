package structure.sorttest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 上午10:40
 * To change this template use File | Settings | File Templates.
 */
public class quickSort {
     public static int getMiddle(int[] a,int low,int high){
         int temp=a[low];
          while(low<high){
              while(low<high&&a[high]>temp){
                  high--;
              }
              a[low]=a[high];
              while(low<high&&a[low]<temp){
                  low++;
              }
              a[high]=a[low];
          }
          a[low]=temp;
          return low;
     }
     public static void quickSort(int[] a,int low,int high){
         if(low<high){
             int middle=getMiddle(a,low,high);
             quickSort(a,low,middle-1);
             quickSort(a,middle+1,high);
         }
     }
    public static void quick(int[] a){
        if(a.length>0){
            quickSort(a,0,a.length-1);
        }
    }
     public static void main(String[] args){
         int[] a={1,6,3,2,0,10};
         quick(a);
         for(int i=0;i<a.length;i++){
             System.out.println(a[i]);
         }
     }

}
