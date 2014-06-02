package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 下午10:02
 * To change this template use File | Settings | File Templates.
 */
public class Demo2 {
    public static int getIndex(String str1,String str2){
        int i=0,j=0;
        while(i<str1.length()&&j<str1.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }else{
                break;
            }
        }
        return i;
    }
    public static void main(String[] args){
        Demo2 d2=new Demo2();
        String str1="abcdefg";
        String str2="abcdefh";
        System.out.println(getIndex(str1,str2));
    }
}
