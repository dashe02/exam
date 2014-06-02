package org.java.test.template;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午4:31
 * To change this template use File | Settings | File Templates.
 */
public class Coffee extends CaffeineBeverage{

    void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }
    void brew(){
        System.out.println("Dripping Coffee through filter");
    }
}
