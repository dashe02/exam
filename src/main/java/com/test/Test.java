package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-28
 * Time: 下午10:25
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public String getString(String str,int minLength,char padChar){
         StringBuilder sb=new StringBuilder();
        if(str.length()<minLength){
               int len=minLength-str.length();
               for(int i=0;i<len;i++){
                   sb.append(padChar);
               }
               sb.append(str);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Test test=new Test();
        test.getString("abcde",7,'x');
    }
}
