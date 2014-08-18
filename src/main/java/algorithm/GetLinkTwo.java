package algorithm;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午6:21
 * To change this template use File | Settings | File Templates.
 */
public class GetLinkTwo {
    //求链表的倒数第二个节点
    public static void getLinkTwo(LinkedList list){
        System.out.println(list.get(list.size() - 2));
    }
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();
        list.add("4");
        list.add("2");
        list.add("1");
        list.add("5");
        list.add("7");
        list.add("0");
        getLinkTwo(list);
    }
}
