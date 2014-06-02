package org.whut.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-17
 * Time: 下午10:06
 * To change this template use File | Settings | File Templates.
 */
public class Test4 {
    private Test4 test4=null;
    public Test4(){
    }
    public Test4 getTest4(){
        if(test4==null){
            synchronized (this){
              if(test4==null){
                  test4=new Test4();
              }
            }
        }
        return test4;
    }
}
