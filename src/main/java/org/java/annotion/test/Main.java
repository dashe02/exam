package org.java.annotion.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午7:58
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        ParseAnnotation parse=new ParseAnnotation();
        parse.parseMethod(SayHello.class);
        parse.parseType(SayHello.class);
    }
}
