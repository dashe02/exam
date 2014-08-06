package org.java.test.flyweight;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 下午7:14
 * To change this template use File | Settings | File Templates.
 */
public class FlyweightPattern {
    FlyweightFactory factory=new FlyweightFactory();
    FlyWeight fly1;
    FlyWeight fly2;
    FlyWeight fly3;
    FlyWeight fly4;
    FlyWeight fly5;
    FlyWeight fly6;
    public FlyweightPattern(){
        fly1=factory.getFlyWeight("Google");
        fly2=factory.getFlyWeight("Qutr");
        fly3=factory.getFlyWeight("Google");
        fly4=factory.getFlyWeight("Google");
        fly5=factory.getFlyWeight("Google");
        fly6=factory.getFlyWeight("Google");
    }
    public void showFlyweight(){
        fly1.operation();
        fly2.operation();
        fly3.operation();
        fly4.operation();
        fly5.operation();
        fly6.operation();
        int objSize=factory.getFlyweightSize();
        System.out.println("objSize=" + objSize);
    }
    public static void main(String[] args){
        System.out.println("The FlyWeight IsPattern!");
        FlyweightPattern fp=new FlyweightPattern();
        fp.showFlyweight();
    }




}
