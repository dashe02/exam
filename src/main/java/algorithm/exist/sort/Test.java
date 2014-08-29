package algorithm.exist.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午6:52
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
         int[] a={1,4,5,7,0,9,2,2};
         HeapSort.heapSort(a);
         for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
         }
    }
}
