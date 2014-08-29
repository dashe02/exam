package algorithm.exist.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午7:08
 * To change this template use File | Settings | File Templates.
 */
public class InsertSort {
        public static void insertSort(int[] a){
            int temp=0;
            int j;
            int len=a.length;
            for(int i=1;i<len;i++){
                temp=a[i];
                j=i-1;
                for(;j>=0&&temp<a[j];j--){
                    a[j+1]=a[j];
                }
                a[j+1]=temp;
            }
        }
}
