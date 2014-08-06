package org.java.annotion.test;

import org.java.annotion.HelloWorld;
import org.java.annotion.Yts;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午7:46
 * To change this template use File | Settings | File Templates.
 */
public class ParseAnnotation {
    public void parseMethod(Class clazz)throws Exception{
        Object obj=clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});
        for(Method method:clazz.getDeclaredMethods()){
            HelloWorld say=method.getAnnotation(HelloWorld.class);
            String name="";
            if(say!=null){
                name=say.name();
                method.invoke(obj,name);
            }
            Yts yts=(Yts)method.getAnnotation(Yts.class);
            if(yts!=null){
                if(Yts.YtsType.util.equals(yts.classType())){
                    System.out.println("this is a util method");
                }else {
                    System.out.println("this is a other method");
                }
            }
        }
    }
        public void parseType(Class clazz) throws Exception{
            Yts yts=(Yts)clazz.getAnnotation(Yts.class);
            if(yts!=null){
                if(Yts.YtsType.util.equals(yts.classType())){
                    System.out.println("this is a util class");
                }else {
                    System.out.println("this is a other class");
                }
            }
        }




}
