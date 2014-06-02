package org.java.test.factory1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-3
 * Time: 下午12:05
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        ShapeFactory sf1=new CircleFactory();
        ShapeFactory sf2=new SquareFactory();
        sf1.anOperation("shape one");
        sf2.anOperation("shape two");
    }
}
