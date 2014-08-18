package algorithm.sort.first;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午8:21
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
           int[] a={1,3,2,5,6,7,0};
           HeapSort.heapSort(a);
           for(int i=0;i<a.length;i++){
               System.out.println(a[i]);
           }
    }
}
