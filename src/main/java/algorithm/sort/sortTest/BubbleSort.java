package algorithm.sort.sortTest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-18
 * Time: 下午3:13
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort {
     public static void bubbleSort(int[] a){
         boolean flag=false;
         for(int i=0;i<a.length-1;i++){
                  flag=true;
             for(int j=0;j<a.length-i-1;j++){
                 if(a[j+1]<a[j]){
                     int temp=a[j];
                     a[j]=a[j+1];
                     a[j+1]=temp;
                     flag=false;
                 }
             }
             if(flag){
                 break;
             }
         }
     }
}
