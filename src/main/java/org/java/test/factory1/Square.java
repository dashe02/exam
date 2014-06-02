package org.java.test.factory1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-3
 * Time: 上午11:22
 * To change this template use File | Settings | File Templates.
 */
public class Square extends Shape{
    public Square(String aName){
       super(aName);
    }
    public void draw(){
       System.out.println("This is draw a square");
    }
    public void erase(){
        System.out.println("This is erase a square");
    }
}
