package org.java.test.closepackage;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午6:35
 * To change this template use File | Settings | File Templates.
 */
public class test {
    public static void main(String[] args){
        DemoClass demoClass=new DemoClass();
        demoClass.getInnerClass().findUser("张三");
    }
}
