package structure.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-30
 * Time: 下午8:22
 * To change this template use File | Settings | File Templates.
 */
public class InsertSort {
     public static void insertSort(int[] a){
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
    public static void main(String[] args){
        int[] a={23,25,12,42,35};
        insertSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
