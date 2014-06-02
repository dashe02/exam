package org.java.test.factory;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-3
 * Time: 上午10:57
 * To change this template use File | Settings | File Templates.
 */
public abstract class Shape {
    public abstract void draw();

    public abstract void erase();

    public String name;

    public Shape(String aName){
         name=aName;
    }
}
