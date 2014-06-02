package org.java.test.template1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午4:41
 * To change this template use File | Settings | File Templates.
 */
public abstract class CoffeineBeverage {

    void boilWater(){
        System.out.println("Boiling Water");
    }

     void pourInCup(){
      System.out.println("Pouring into cup");
     }

    abstract void brew();

    abstract void addCondiments();

    final void prepareRecipe(){
      boilWater();
      brew();
      pourInCup();
      addCondiments();
    }
}
