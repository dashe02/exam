package org.java.test.flyweight;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 下午7:06
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteFlyweight extends FlyWeight{
    private String string;

    public ConcreteFlyweight(String str){
        string=str;
    }

    @Override
    public void operation() {
     System.out.println("Concrete---Flyweight:"+string);
    }
}
