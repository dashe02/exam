package org.java.test.closepackage;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午6:31
 * To change this template use File | Settings | File Templates.
 */
public class DemoClass {
    class InnerClass implements IUser{
        public void findUser(String name){
            System.out.print("找到的这个人是:"+name);
        }
    }
    public InnerClass getInnerClass(){
        return new InnerClass();
    }
}
