package org.whut.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-17
 * Time: 下午10:08
 * To change this template use File | Settings | File Templates.
 */
public class Test5 {
    public void count(int n){
        System.out.println(n);
        if(n<5000){
            count(2*n);
        }else{
            count2(n/2);
        }
    }
    public void count2(int n){
        System.out.println(n);
        if(n>1237){
            count2(n/2);
        }
    }
    public static void main(String[] args){
        Test5 test5=new Test5();
        test5.count(1237);

    }
}
