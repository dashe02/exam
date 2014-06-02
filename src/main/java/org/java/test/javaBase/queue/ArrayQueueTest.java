package org.java.test.javaBase.queue;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 下午5:10
 * To change this template use File | Settings | File Templates.
 */
public class ArrayQueueTest {
    public static void main(String[] args){
         ArrayQueue<String> q=new ArrayQueue<String>();
         q.add("a");
         q.add("b");
         q.add("c");
         q.add("d");
         q.add("e");
         q.add("f");
         q.add("g");
         while (!q.isEmpty()){
             String temp=q.remove();
             System.out.println(temp);
         }
    }
}
