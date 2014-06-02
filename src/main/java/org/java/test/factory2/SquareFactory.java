package org.java.test.factory2;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午3:56
 * To change this template use File | Settings | File Templates.
 */
public class SquareFactory extends ShapeFactory{

    public Shape factoryMethod(String aName){
        return new Square(aName+"(Created by SquareFactory)");
    }


}
