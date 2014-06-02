package org.java.test.javaBase.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 下午7:46
 * To change this template use File | Settings | File Templates.
 */
public class SelectSort {

    public void selectSort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
     public static void main(String[] args){
         int[] a={1,4,2,9,6};
         SelectSort selectSort=new SelectSort();
         selectSort.selectSort(a);
     }

}
