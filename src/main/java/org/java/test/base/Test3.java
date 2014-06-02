package org.java.test.base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-13
 * Time: 下午4:01
 * To change this template use File | Settings | File Templates.
 */
public class Test3 {

    public void sort(int n){
        System.out.println(n);
        if(n<5000){
            sort(n);
        }else{
            sort2(n/2);
        }
    }
    public void sort2(int n){
        System.out.println(n);
        if(n>1237){
            sort2(n / 2);
        }
    }
    public static void main(String[] args){
        Test2 test2=new Test2();
        test2.sort(1237);
    }
}
