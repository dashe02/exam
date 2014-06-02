package org.java.test.javaBase.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 下午8:05
 * To change this template use File | Settings | File Templates.
 */
public class InsertSort1 {
    public static void insertSort(int[] a){
        for(int i=1;i<=a.length-1;i++){
            int j=i;
            while(j>=1&&a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args){
        int[] a={1,6,3,2,9,0};
        InsertSort1.insertSort(a);
        System.out.println("结果如下:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }

}
