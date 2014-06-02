package org.java.test.base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-13
 * Time: 下午3:27
 * To change this template use File | Settings | File Templates.
 */
public class Bubble {
     public static  void main(String[] args){
         int[] a={1,6,3,2,9,5};
         for(int i=0;i<a.length-1;i++){
             for(int j=0;j<a.length-i-1;j++){
                 if(a[j]>a[j+1]){
                     int temp=a[j+1];
                     a[j+1]=a[j];
                     a[j]=temp;
                 }
             }
         }
         for(int i=0;i<a.length;i++){
             System.out.println(a[i]);
         }
     }
}
