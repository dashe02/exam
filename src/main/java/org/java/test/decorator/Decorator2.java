package org.java.test.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午4:02
 * To change this template use File | Settings | File Templates.
 */
public class Decorator2 implements IthirdParty{
    private IthirdParty thirdParty;
    public Decorator2(IthirdParty thirdParty){
        this.thirdParty=thirdParty;
    }
    public String sayMsg(){
        return "##2"+thirdParty.sayMsg()+"##2";
    }
}
