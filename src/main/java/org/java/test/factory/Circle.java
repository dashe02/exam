package org.java.test.factory;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-3
 * Time: 上午10:59
 * To change this template use File | Settings | File Templates.
 */
public class Circle extends Shape{
    public void draw(){
     System.out.println("It will draw a circle");
    }
    public void erase(){
     System.out.println("It will erase a circle");
    }
    public Circle(String aName){
        super(aName);
    }

}
