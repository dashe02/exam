package org.java.test.javaBase.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 下午6:21
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort {
     /*
     * 快速排序，对整数型数组o进行
     */
    public  void quiteSort(int[] array,int low,int hight){
            if(low<hight){
                int middle=getMiddle(array,low,hight);
                quiteSort(array, low, middle-1);
                quiteSort(array, middle+1, hight);
            }
    }
    private int getMiddle(int array[],int low,int high){
          int temp=array[low];
          while(low<high){
              while (low<high&&array[high]>temp){
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
    public void quick(int[] str){
        if(str.length>0){
            quiteSort(str,0,str.length-1);
        }
    }
    public static void main(String[] args){
           int[] a={1,4,2,6,9,0};
           QuickSort q=new QuickSort();
           q.quick(a);
           for(int i=0;i<a.length;i++){
               System.out.println(a[i]+"");
           }
           System.out.println();
    }
}
