package algorithm.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午6:30
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        int[] a={1,2,8,9,0,5};
        MergeSort.mergeSort(a);
        for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
        }
    }
}
