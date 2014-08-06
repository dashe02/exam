package regex;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-4
 * Time: 下午2:18
 * To change this template use File | Settings | File Templates.
 */
public class Test4 {
    public static void main(String[] args){
        Queue<String> queue=new LinkedList<String>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        System.out.println(queue.size());
        String str;
        while((str=queue.poll())!=null){
            System.out.println(str);
        }
        System.out.println(queue.size());
    }
}
