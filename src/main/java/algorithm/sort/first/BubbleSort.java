package algorithm.sort.first;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午8:21
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort {
    public static void bubbleSort(int[] a) {
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
    }
}
