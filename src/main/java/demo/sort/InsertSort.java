package demo.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午12:14
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
        int[] a={5,3,1,0,10,9};
        insertSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
