package dailyTest.sixDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-25
 * Time: 上午12:49
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        int[] a={1,4,6,3,8,0};
        HeapSort.heapSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
