package algorithm.sort.sortTest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-18
 * Time: 下午3:12
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        int[] a={1,4,7,3,0,8};
        BubbleSort.bubbleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
