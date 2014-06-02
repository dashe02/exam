package org.java.test.factory;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-3
 * Time: 上午11:08
 * To change this template use File | Settings | File Templates.
 */
public class CircleFactory extends ShapeFactory{
    protected Shape factoryMethod(String aName){
        return new Circle(aName+"(created by circleFactory)");
    }
}
