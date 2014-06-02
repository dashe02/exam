package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 下午9:29
 * To change this template use File | Settings | File Templates.
 */
public class Demo1 {
    public int getIndex(char str[],char pat[]){
        int i=0,j=0;
        while(i<str.length&&j<pat.length){
            if(str[i]==pat[j]){
                i++;
                j++;
            }else{
                i=i-j+2; //返回到子串对应的主串字符
                j=0;
            }
        }
        if(j==pat.length){
            return i-j+1;
        }
        return -1;
    }
    public static void main(String[] args){
        Demo1 d=new Demo1();
        char[] a={'a','b','a','b','a','b','c','d','a','b','a','b','d','a'};
        char[] b={'a','b','a','b','d'};
        System.out.println(d.getIndex(a,b));
    }
}
