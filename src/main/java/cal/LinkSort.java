package cal;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-12
 * Time: 下午11:18
 * To change this template use File | Settings | File Templates.
 */
public class LinkSort {
    public static void linkSort(LinkedList l){
        Collections.sort(l);
        for(int i=0;i<l.size();i++){
          System.out.println(l.get(i));
        }
    }
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(0);
        list.add(6);
        linkSort(list);
    }
}
