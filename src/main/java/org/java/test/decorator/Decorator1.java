package org.java.test.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午4:00
 * To change this template use File | Settings | File Templates.
 */
public class Decorator1 implements IthirdParty{
    private IthirdParty thirdParty;

    public Decorator1(IthirdParty thirdParty){
        this.thirdParty=thirdParty;
    }
    public String sayMsg(){
        return "##1"+thirdParty.sayMsg()+"##1";
    }

}
