package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 下午6:12
 * To change this template use File | Settings | File Templates.
 */
public class AbsMin {
    //一个整型数组，求出两两之差绝对值最小的值
    /*
    * 思路:1.对数组进行排序.2.求出相邻两数的差值.3.求出差值中最小的值
    */
    public static int getMiddle(int[] a,int low,int high){
        int temp=a[low];
        while(low<high){
            while(low<high&&temp<=a[high]){
                high--;
            }
            a[low]=a[high];
            while (low<high&&temp>=a[low]){
                low++;
            }
            a[high]=a[low];
        }
        a[low]=temp;
        return low;
    }
     public static void quick_sort(int[] a,int low,int high){
                 if(low>=high)
                     return;
                 int mid=getMiddle(a,low,high);
                 quick_sort(a,low,mid);
                 quick_sort(a,mid+1,high);
     }
     public static void sort(int[] a){
             if(a.length>0){
                 quick_sort(a,0,a.length-1);
             }
     }
     public static int[] getDiff(int[] a){
            int[] temp=new int[a.length-1];
             for(int i=0;i<a.length-1;i++){
                  temp[i]=Math.abs(a[i]-a[i+1]);
             }
             return temp;
     }
     public static void getMin(int[] a){
             sort(a);
             System.out.println(a[0]);
     }
     public static void main(String[] args){
              int[] a={1,10,6,17,4};
              sort(a);      //O(nlogn)
              int[] b=getDiff(a);  //O(n)
              getMin(b);          //O(nlogn)
     }
}
