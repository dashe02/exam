package structure.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-30
 * Time: 下午8:59
 * To change this template use File | Settings | File Templates.
 */
public class InsertDemo {
    public static void sort(int[] a){
        int temp=0;
        for(int i=1;i<a.length;i++){
           int j=i-1;
           temp=a[i];
           for(;j>=0&&temp<a[j];j--){
               a[j+1]=a[j];
           }
            a[j+1]=temp;
        }
    }
}
