package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午4:20
 * To change this template use File | Settings | File Templates.
 */
public class GetCollectionDiff {
    /*
    * 求两个集合的差集
    */
    public static void getCollectionDiff(List<Integer> list1,List<Integer> list2){
            list1.removeAll(list2);
            Iterator it=list1.iterator();
            while(it.hasNext()){
                int x=(Integer)it.next();
                System.out.println(x);
            }
    }
    public static void main(String[] args){
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        list1.add(5);
        list1.add(10);
        list1.add(20);
        list1.add(15);
        list1.add(25);
        list1.add(30);
        list2.add(5);
        list2.add(15);
        list2.add(35);
        list2.add(25);
        getCollectionDiff(list1,list2);
    }
}
