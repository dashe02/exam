package org.java.test.javaBase.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-24
 * Time: 下午9:59
 * To change this template use File | Settings | File Templates.
 */
public class Demo2 {
    public static void stringSort(String[] str){
        for(int i=0;i<str.length;i++){
            for(int j=0,k=0;j<str.length-i-1&&k<str.length;j++){
                char c1=str[j].charAt(k);
                char c2=str[j+1].charAt(k);
              if((c1!=c2)){
                         if(rule(c1)-rule(c2)>0){
                                  String temp=str[j];
                                  str[j]=str[j+1];
                                  str[j+1]=temp;
                         }
                }
            }
        }
        for(String st:str){
            System.out.println(st);
        }
    }
    public static int rule(char c){
         int priority=0;
         switch(c){
             case 'd':
                 priority=0;
                  break;
             case 'g':
                 priority=1;
                  break;
             case 'e':
                 priority=2;
                 break;
             case 'c':
                 priority=3;
                  break;
             case 'f':
                 priority=4;
                 break;
             case 'b':
                 priority=5;
                 break;
             case 'o':
                 priority=6;
                 break;
             case 'a':
                 priority=7;
                 break;
         }
           return priority;
    }
    public static void main(String[] args){
          String[] str={"bed", "dog", "dear", "eye"};

              stringSort(str);

    }
}
