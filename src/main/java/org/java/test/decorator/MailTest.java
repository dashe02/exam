package org.java.test.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午4:04
 * To change this template use File | Settings | File Templates.
 */
public class MailTest {
    public static void main(String[] args){
        IthirdParty thirdPartyOne=new ThirdParty();
        IthirdParty decorator1=new Decorator1(thirdPartyOne);
        IthirdParty decorator2=new Decorator2(decorator1);
        System.out.println(decorator2.sayMsg());
    }
}
