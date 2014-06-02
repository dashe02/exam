package demo.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 上午11:01
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort {
    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length;i++){
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
        int[] a={1,7,3,9,0,10};
        bubbleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
