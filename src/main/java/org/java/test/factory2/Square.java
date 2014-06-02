package org.java.test.factory2;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 上午9:07
 * To change this template use File | Settings | File Templates.
 */
public class Square extends Shape{

    public Square(String aName){
        super(aName);
    }
    @Override
    public void draw() {
        System.out.println("draw a square");
    }

    @Override
    public void erase() {
        System.out.println("erase a square");
    }
}
