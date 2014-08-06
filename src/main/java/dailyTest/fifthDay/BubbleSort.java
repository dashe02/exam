package dailyTest.fifthDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-18
 * Time: 下午5:40
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort {
    public static void bubbleSort(int[] a){
           for(int i=0;i<a.length-1;i++){
               for(int j=0;j<a.length-i-1;j++){
                   if(a[j+1]<a[j]){
                       int temp=a[j];
                       a[j]=a[j+1];
                       a[j+1]=temp;
                   }
               }
           }
    }
    public static void main(String[] args){
        int[] a={1,4,3,2,7,0};
        bubbleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
