package org.java.test.builder1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午10:28
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        PersonDirector pd=new PersonDirector();
        Person person=pd.constructPerson(new ConcreteBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
