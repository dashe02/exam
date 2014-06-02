package org.java.test.template;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午4:35
 * To change this template use File | Settings | File Templates.
 */
public class TestApp {
    public static void main(String[] args){
        Tea tea=new Tea();
        Coffee coffee=new Coffee();
        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}
