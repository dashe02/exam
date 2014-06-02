package org.java.test.factory2;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 上午9:15
 * To change this template use File | Settings | File Templates.
 */
public class CircleFactory extends ShapeFactory{

      public Shape factoryMethod(String aName){
          return new Circle(aName+"(Created by CircleFactory)");
      }

}
