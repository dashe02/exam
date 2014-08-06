package org.java.annotion.test1;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午9:17
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        try{
            Class clazz=TestClass.class;
            Object obj=clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});
            for(Field field:clazz.getDeclaredFields()){
                id myId=field.getAnnotation(id.class);
                if(myId!=null){
                    System.out.println(myId);
                    System.out.println(field.getName()+"是ID字段");
                }else{
                    System.out.println(field.getName()+"不是ID字段");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
