package org.java.test.factory1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-3
 * Time: 上午11:24
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
