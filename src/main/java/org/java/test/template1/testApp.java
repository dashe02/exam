package org.java.test.template1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午4:50
 * To change this template use File | Settings | File Templates.
 */
public class testApp {
    public static void main(String[] args){
        Coffee coffee=new Coffee();
        Tea tea=new Tea();
        coffee.prepareRecipe();
        tea.prepareRecipe();
    }

}
