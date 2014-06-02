package structure.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-30
 * Time: 下午10:06
 * To change this template use File | Settings | File Templates.
 */
public class straightInsertionSort {
    public static void sort(int[] a){
        int sentinel,j;
        for(int i=1;i<a.length;i++){
            j=i-1;
            sentinel=a[i]; //哨兵
            while(j>=0&&sentinel<a[j]){
                a[j+1]=a[j];  //将大于sentinel的值整体后移一个单位
                j--;
            }
            a[j+1]=sentinel;
        }
    }
    public static void main(String[] args){
        int[] a={1,6,2,9,3,5};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
