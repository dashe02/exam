package org.java.test.javaBase.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-25
 * Time: 下午8:04
 * To change this template use File | Settings | File Templates.
 */
public class zhizhu1 {
    public static void analyseZhuShu(int m){
        for(int i=2;i<m;i++){
            if(m%i==0){
                System.out.print(i+"*");
                m=m/i;
                i--;
            }
        }
        System.out.println(m);
    }
    public static void main(String[] args){
        analyseZhuShu(435234);
    }
}
