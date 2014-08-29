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
        int a[]={15,2,3,5,22,3,22,42,7,8,96,34,57,8};
        QuickSort.quickSort(a);
           for(int i=0;i<a.length;i++){
               System.out.println(a[i]);
           }
        StringBuilder sb=new StringBuilder();
        sb.append("1");
    }
}
