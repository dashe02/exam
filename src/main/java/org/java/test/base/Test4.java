package org.java.test.base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-13
 * Time: 下午4:10
 * To change this template use File | Settings | File Templates.
 */
class Test6{
    public class Test5{
        public void say(){
            System.out.println("我是内部类5");
        }
    }
    public Test5 getInnerClass(){
        return new Test5();
    }
}
public class Test4 {
        public static void main(String[] args){
            Test6 test6=new Test6();
            test6.getInnerClass().say();
        }

}
