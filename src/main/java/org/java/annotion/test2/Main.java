package org.java.annotion.test2;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午9:27
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        try{
           Class clazz=TestClass.class;
           for(Method method:clazz.getDeclaredMethods()){
                 Test t=method.getAnnotation(Test.class);
                 if(t!=null){
                     System.out.println(t);
                     System.out.println(method.getName()+"是Test方法");
                     String s=clazz.getName();
                     System.out.println(s);
                     Class class1=Class.forName(s);
                     TestClass c=(TestClass)class1.newInstance();
                     c.test();
                 }else {
                     System.out.print(method.getName()+"是非Test方法");
                 }
           }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
