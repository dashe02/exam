package algorithm.sort.yanjiu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-16
 * Time: 下午9:50
 * To change this template use File | Settings | File Templates.
 */
public class QuChogn {
    public static void quchogn(int[] a){
        Set s=new HashSet();
        s.addAll(Arrays.asList(a));
        Iterator it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void main(String[] args){
        int[] a={1,3,4,5,6,6,1};
        quchogn(a);
    }
}
