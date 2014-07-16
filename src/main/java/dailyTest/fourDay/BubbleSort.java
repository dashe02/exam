package dailyTest.fourDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-14
 * Time: 上午11:29
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort {
    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){
          for(int j=0;j<a.length-i-1;j++){
              if(a[j]>a[j+1]){
                  int temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
              }
          }
        }
    }
     public static void main(String[] args){
       int[] a={1,5,8,0,4,2,7};
       bubbleSort(a);
       for(int i=0;i<a.length;i++){
       System.out.println(a[i]);
       }
    }
}
