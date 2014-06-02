package org.java.test.factory2;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 上午9:15
 * To change this template use File | Settings | File Templates.
 */
public abstract class ShapeFactory {

     protected abstract Shape factoryMethod(String aName);

     public void anOperation(String aName){
           Shape s=factoryMethod(aName);
           System.out.println("The current sharp is"+s.name);
           s.draw();
           s.erase();
     }

}
