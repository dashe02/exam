package org.java.test.factory;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-3
 * Time: 上午11:03
 * To change this template use File | Settings | File Templates.
 */
public class Square extends Shape {
    public void draw(){
      System.out.println("It will draw a square");
    }
    public void erase(){
        System.out.println("It will erase a square");
    }
    public Square(String aName){
        super(aName);
    }
}
