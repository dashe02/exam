package org.java.test.javaBase.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-24
 * Time: 下午9:32
 * To change this template use File | Settings | File Templates.
 */
public class Demo1 {
    public static void stringSort(String[] str){
          for(int i=0;i<str.length;i++){
              for(int j=0;j<str.length-i-1;j++){
                  if(str[j].compareToIgnoreCase(str[j+1])>0){
                      String temp=str[j+1];
                      str[j+1]=str[j];
                      str[j]=temp;
                  }
              }
          }
        for(String st:str){
            System.out.println(st);
        }
    }
    public static void main(String[] args){
        String[] str={"va","Ac","ab","Bv","cd"};
        stringSort(str);
    }
}
