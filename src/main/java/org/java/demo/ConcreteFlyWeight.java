package org.java.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 下午9:52
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteFlyWeight extends FlyWeight{
    private String string;

    public ConcreteFlyWeight(String str){
        string=str;
    }
    @Override
    public void operation() {
    System.out.println("Concrete--FlyWeight"+string);
    }
}
