package org.java.test.javaBase.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 下午7:04
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort {
    public int getMiddle(int[] array,int low,int high){
           int temp=array[low];
            while(low<high){
                while(low<high&&array[high]>temp){
                    high--;
                }
                array[low]=array[high];
                while(low<high&&array[low]<temp){
                    low++;
                }
                array[high]=array[low];
            }
            array[low]=temp;
            return low;
    }
     public void quickSort(int[] array,int low,int high){
           if(low<high){
               int middle=getMiddle(array,low,high);
               quickSort(array, low, middle-1);
               quickSort(array, middle+1, high);
           }

     }
      public void quick(int array[]){
          if(array.length>0){
              quickSort(array,0,array.length-1);
          }
      }
    public static void main(String[] args){
        int[] a={1,0,3,7,5,2};
        QuickSort q=new QuickSort();
        q.quick(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
