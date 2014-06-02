package org.java.test.factory2;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 上午9:04
 * To change this template use File | Settings | File Templates.
 */
public abstract class Shape {
    public String name;
    public Shape(String aName){
      name=aName;
    }
    public abstract void draw();
    public abstract void erase();
}
