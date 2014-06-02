package org.java.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午5:54
 * To change this template use File | Settings | File Templates.
 */
public class PublicConsumeTest {
    public static void main(String[] args){
         PublicResource publicResource=new PublicResource();
         Publish publish=new Publish(publicResource);
         Consume consume=new Consume(publicResource);
         publish.start();
         consume.start();
    }
}
