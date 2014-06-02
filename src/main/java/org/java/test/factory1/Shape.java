package org.java.test.factory1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-3
 * Time: 上午11:17
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
