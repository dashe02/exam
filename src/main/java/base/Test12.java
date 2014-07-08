package base;

import sun.security.util.BigInt;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午5:25
 * To change this template use File | Settings | File Templates.
 */
public class Test12 {
    public static void minus(){
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("输入被减数:");
        String a1=scanner1.next();
        System.out.println("减数:");
        String a2=scanner2.next();
        long l1=Long.parseLong(a1);
        long l2=Long.parseLong(a2);
        System.out.println(l1-l2);
    }
    public static void main(String[] args){
        minus();
    }
}
