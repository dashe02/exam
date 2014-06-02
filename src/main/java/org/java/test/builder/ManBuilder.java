package org.java.test.builder;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午9:49
 * To change this template use File | Settings | File Templates.
 */
public class ManBuilder implements PersonBuilder{
    Person person;

    public  ManBuilder(){
        person=new Person();
    }
    public void buildHead(){
        System.out.println("建造男人的头");
    }
    public void buildBody(){
        System.out.println("建造男人的身体");
    }
    public void buildFoot(){
        System.out.println("建造男人的脚");
    }
    public Person PersonBuilder(){
         return person;
    }

}
