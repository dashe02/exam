package org.java.test.builder1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午10:22
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteBuilder implements PersonBuilder{

    Person person;

    public ConcreteBuilder(){
        person=new Person();
    }

    public void buildHead(){
      System.out.println("建造头");
    }
    public void buildBody(){
       System.out.println("建造身体");
    }
    public void buildFoot(){
        System.out.println("建造脚");
    }
    public Person PersonBuilder(){
        return person;
    }
}
