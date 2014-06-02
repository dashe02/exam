package org.java.test.javaBase.algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-26
 * Time: 下午5:28
 * To change this template use File | Settings | File Templates.
 */
public class ArrayClass {

    public void IterateArr(int[] arr){
        //遍历
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public int[] add(int index,int value,int[] arr){
           int[] temp=new int[arr.length+1];
           for(int i=0;i<arr.length;i++){
               temp[i]=arr[i];
           }
           for(int i=index;i<temp.length-1;i++){
               temp[i+1]=arr[i];
           }
           temp[index]=value;
           return temp;
    }
    public int find(int index,int[] arr){
         return arr[index];
    }
    public int findByValue(int value,int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                j=i;
            }
        }
        return j;
    }
    public int[] deleteByValue(int value,int[] arr){
          int j=0;
          int[] temp=new int[arr.length-1];
          for(int i=0;i<arr.length;i++){
              if(arr[i]==value){
                   j=i;
              }
          }
          for(int i=0;i<j;i++){
              temp[i]=arr[i];
          }
          for(int i=j;i<arr.length-1;i++){
              temp[i]=arr[i+1];
          }
        return temp;
    }
    public int[] delete(int index,int[] arr){
        int[] temp=new int[arr.length-1];
        for(int i=0;i<index;i++){
            temp[i]=arr[i];
        }
        for(int i=index;i<arr.length-1;i++){
            temp[i]=arr[i+1];
        }
         return temp;
    }
    public static void main(String[] args){
          int[] a={1,5,3,2,0,8,9};
          ArrayClass arrayClass=new ArrayClass();
          int[] t=arrayClass.deleteByValue(3,a);
          for(int i=0;i<t.length;i++){
              System.out.println(t[i]);
          }
    }
}
