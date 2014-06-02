package org.java.test.base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-13
 * Time: 下午3:50
 * To change this template use File | Settings | File Templates.
 */
public class Test2 {
    public void sort(int n){
        System.out.println(n);
        if(n<5000){
           sort(2*n);
        }else{
            sort2(n/2);
        }
    }
    public void sort2(int n){
        System.out.println(n);
        if(n>1237){
           //System.out.println(n);
           sort2(n/2);
        }
    }
    public static void main(String[] args){
        Test2 test2=new Test2();
        test2.sort(1237);
    }
}
