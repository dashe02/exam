package org.java.test.factory;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-3
 * Time: 上午11:10
 * To change this template use File | Settings | File Templates.
 */
public class SquareFactory extends ShapeFactory{
    protected Shape factoryMethod(String aName){
        return new Square(aName+"(created by SquareFactory)");
    }
}
