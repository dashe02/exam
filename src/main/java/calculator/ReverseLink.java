package calculator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 上午8:42
 * To change this template use File | Settings | File Templates.
 */
public class ReverseLink {
    public static void reverseLink(LinkedList<String> list){
        Stack<String> ss=new Stack<String>();
        for(int i=0;i<list.size();i++){
            ss.push(list.get(i));
        }
        while(!ss.empty()){
           System.out.println(ss.pop());
        }
    }
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        reverseLink(list);
    }
}
