package org.java.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 下午9:59
 * To change this template use File | Settings | File Templates.
 */
public class FlyWeightPattern {
    private FlyWeightFactory factory=new FlyWeightFactory();
    FlyWeight fly1;
    FlyWeight fly2;
    FlyWeight fly3;
    FlyWeight fly4;
    FlyWeight fly5;
    FlyWeight fly6;
    public FlyWeightPattern(){
        fly1=new ConcreteFlyWeight("Google");
        fly2=new ConcreteFlyWeight("Qutr");
        fly3=new ConcreteFlyWeight("Google");
        fly4=new ConcreteFlyWeight("Google");
        fly5=new ConcreteFlyWeight("Google");
        fly6=new ConcreteFlyWeight("Google");
    }
    public void display(){
        fly1.operation();
        fly2.operation();
        fly3.operation();
        fly4.operation();
        fly5.operation();
        fly6.operation();
    }
    public static void main(String[] args){
        FlyWeightPattern flyWeightPattern=new FlyWeightPattern();
        flyWeightPattern.display();
    }
}
