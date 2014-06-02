package org.java.test.factory2;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 上午9:06
 * To change this template use File | Settings | File Templates.
 */
public class Circle extends Shape{
   public Circle(String aName){
       super(aName);
   }
    @Override
    public void draw() {
     System.out.println("draw a Circle");
     }

    @Override
    public void erase() {
     System.out.println("erase a Circle");
    }
}
