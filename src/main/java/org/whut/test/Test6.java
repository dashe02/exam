package org.whut.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-17
 * Time: 下午10:15
 * To change this template use File | Settings | File Templates.
 */
public class Test6 {
    public int getAge(int n){
       if(n==1){
           return 10;
       }else{
           return getAge(n-1)+2;
       }
    }
    public static void main(String[] args){
        System.out.println(new Test6().getAge(8));
    }
}
