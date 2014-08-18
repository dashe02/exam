package algorithm.sort.link;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午11:56
 * To change this template use File | Settings | File Templates.
 */
public class LinkSort {
    public static void linkSort(LinkedList list){
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.add(4);
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(0);
        linkSort(list);
    }

}
