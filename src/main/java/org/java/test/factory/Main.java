package org.java.test.factory;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-3
 * Time: 上午11:12
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        ShapeFactory sf1=new SquareFactory();
        ShapeFactory sf2=new CircleFactory();
        sf1.anOperation("Shape one");
        sf2.anOperation("Shape two");
    }
}
