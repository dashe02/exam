package org.java.annotion.test;

import org.java.annotion.Yts;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午7:42
 * To change this template use File | Settings | File Templates.
 */
@Yts(classType = Yts.YtsType.util)
public class SayHello {
     public void sayHello(String name) {
         if(name==null||name.equals("")){
             System.out.println("hello world!");
         }else {
             System.out.println(name+"say hello world!");
         }
     }
}
