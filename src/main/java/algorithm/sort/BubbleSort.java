package algorithm.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午6:29
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort {
     public static int[] bubbleSort(int[] a){
           int temp;
           boolean flag=false;
           for(int i=0;i<a.length-1;i++){
               flag=true;
               for(int j=0;j<a.length-i-1;j++){
                   if(a[j]>a[j+1]){
                      temp=a[j];
                      a[j]=a[j+1];
                      a[j+1]=temp;
                      flag=false;
                   }
               }
               if(flag){
                   break;
               }
           }
         return a;
     }
    public static  void swap(int i,int j){
        int temp=i;
        i=j;
        j=temp;
    }
}
