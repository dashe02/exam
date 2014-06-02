package org.java.test.javaBase.demo;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-24
 * Time: 下午7:16
 * To change this template use File | Settings | File Templates.
 */
public class HuiWen {

    public static String getMaxHuiWenString(String str){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length()/2;i++){
            int count=0;
            for(int j=i;j>0;){
                  if(str.charAt(i-j)==str.charAt(i+j)){
                    j--;
                  }
            }
            sb.append(count);
        }

        return sb.toString();
    }
    public static void main(String[] args){
         String str="12321456121";
         String str1=HuiWen.getMaxHuiWenString(str);
         System.out.println(str1);
    }
}
