package org.java.test.template;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();    //把水煮沸
        brew();         //调制
        pourInCup();    //把饮料倒进被子
        addCondiments(); //添加作料
    }
    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }


}
