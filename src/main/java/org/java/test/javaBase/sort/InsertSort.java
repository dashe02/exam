package org.java.test.javaBase.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 下午7:57
 * To change this template use File | Settings | File Templates.
 */
public class InsertSort {
     public static <T extends Comparable<? super T>> void insertSort(T[] array){
         for(int i=1;i<=array.length-1;i++){
             int j=i;
             while(j>=1&&array[j].compareTo(array[j-1])<0){
                 T temp=array[j];
                 array[j]=array[j-1];
                 array[j-1]=temp;
                 j--;
             }
         }
     }
    public static void main(String[] args){
        Integer[] testArray={23,25,12,42,35};
        InsertSort.insertSort(testArray);
        System.out.println("The result is:");
        for(Integer item:testArray){
            System.out.println(item);
        }
    }





}
