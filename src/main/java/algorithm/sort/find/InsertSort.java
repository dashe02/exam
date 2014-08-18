package algorithm.sort.find;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-18
 * Time: 上午11:36
 * To change this template use File | Settings | File Templates.
 */
public class InsertSort {
      public static void insertSort(int[] a){
          int j;
          int temp=0;
          int len=a.length;
          for(int i=1;i<len;i++){
              temp=a[i];
              j=i-1;
              for(;j>=0&&a[j]>temp;j--){
                  a[j+1]=a[j];
              }
              a[j+1]=temp;
          }
      }
    public static void main(String[] args){
        int[] a={1,3,9,6,0,4,7};
        insertSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
