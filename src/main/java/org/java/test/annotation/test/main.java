package org.java.test.annotation.test;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-27
 * Time: 下午9:04
 * To change this template use File | Settings | File Templates.
 */
public class main {
    public static void main(String[] args){
       try{
           Class clazz=TestClass.class;
           Object obj=clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});
           for(Field field:clazz.getDeclaredFields()){
               id myId=field.getAnnotation(id.class);
               if(myId!=null){
                  System.out.println(field.getName()+"这是一个Id字段");
               }else{
                   System.out.println(field.getName()+"这不是一个Id字段");
               }
           }
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
