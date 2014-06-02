package org.java.test.javaBase.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-25
 * Time: 下午7:10
 * To change this template use File | Settings | File Templates.
 */
public class judgeHuiWen {
     public static boolean judgeHuiWen(String str){
            boolean flag=false;
            int len=str.length()/2;
            int left=len-1;
            int right=len+1;
         while (left<right&&left>=0&&right<str.length()){
            if(str.charAt(left)==str.charAt(right)){
                left--;
                right++;
            }
         }
         if(left==-1&&right==str.length()){
              flag=true;
         }
               return flag;
     }
     public static void main(String[] args){
         System.out.println(judgeHuiWen("abcdedcba"));
     }
}
