package org.java.annotion2;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午9:50
 * To change this template use File | Settings | File Templates.
 */
@Description(author="test",size = 200)
public class DesriptionTest {
    public static void main(String[] args){
        Class clazz=DesriptionTest.class;
        if(clazz.isAnnotationPresent(Description.class)){
            Description desc=(Description)clazz.getAnnotation(Description.class);
            System.out.println("desc.name:"+desc.getClass().getName());
            System.out.println("desc.author:"+desc.author());
            System.out.println("desc.size:"+desc.size());
        }else {
            System.out.println("没有在DescriptionTest上使用注解");
        }
    }
}
