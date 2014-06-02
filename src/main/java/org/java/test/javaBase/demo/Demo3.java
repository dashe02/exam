package org.java.test.javaBase.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-25
 * Time: 下午4:28
 * To change this template use File | Settings | File Templates.
 */
public class Demo3 {
    public int intConvert(int n){
        int result=0;
        StringBuilder sb=new StringBuilder();
         String s=String.valueOf(n);
         for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
         }
         String r=sb.toString();
        // result=Integer.parseInt(r);
         Double d=Double.parseDouble(r);
         Float  f=Float.parseFloat(r);
         System.out.println(f+"??");
        return result;
    }
    public static void main(String[] args){
        Demo3 d=new Demo3();
        System.out.println(d.intConvert(1234569021));
    }
}
