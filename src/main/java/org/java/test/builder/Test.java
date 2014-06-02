package org.java.test.builder;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午10:00
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        PersonDirector pd=new PersonDirector();
        Person person=pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}
