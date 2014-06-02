package org.java.test.javaBase.demo;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-25
 * Time: 下午7:56
 * To change this template use File | Settings | File Templates.
 */
public class ZhiShu {
    public static void analysisZhiShu(int m){
        for(int i=2;i<m;i++){
             if((m%i)==0){
                 System.out.print(i + "*");
                 m=m/i;
                 i--;
             }
        }
        System.out.println(m);
    }
    public static void main(String[] args){
        System.out.println("输入一个整数:");
        Scanner scanner=new Scanner(System.in) ;
         int m=scanner.nextInt();
          analysisZhiShu(m);
    }
}
