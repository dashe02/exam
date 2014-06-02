package org.java.test.javaBase.array;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-23
 * Time: 下午3:39
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        ArrayImpl<String> array=new ArrayImpl<String>();
        array.initArray();
        array.add(0,"test1");
        array.add(1,"test2");
        array.add(2,"test3");
        array.add(3,"test4");
        array.add(4,"test5");
        System.out.println(array.find(3));
        System.out.println(array.length()+"1");
        array.remove(3);
        System.out.println(array.find(3));
        System.out.println(array.length()+"2");
        array.clear();
        System.out.println(array.find(3));
        System.out.println(array.length()+"3");

    }
}
