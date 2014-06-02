package structure.sorttest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 上午11:11
 * To change this template use File | Settings | File Templates.
 */
public class InsertSort {
    public static void insertSort(int[] a){
        int temp=0;
        int j;
        for(int i=1;i<a.length;i++){
            temp=a[i];
            j=i-1;
            for(;j>=0&&temp<a[j];j--){
                 a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
    }
    public static void main(String[] args){
        int[] a={4,2,1,0,29};
        insertSort(a);
        for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
        }

    }
}
