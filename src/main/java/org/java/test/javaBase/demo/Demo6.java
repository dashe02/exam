package org.java.test.javaBase.demo;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-25
 * Time: 下午9:10
 * To change this template use File | Settings | File Templates.
 */
public class Demo6
{
    public static void main(String[] args){
        System.out.println("请输入总人数:");
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        System.out.println("输入出圈的数:");
        int n=scanner.nextInt();
        //初始化数组
        int[] a=new int[m];
        for(int i=0;i<m;i++)
            a[i]=i+1;
            int i=0;
            int j=1;
            int len=m;
        while(len>0){
          if(a[i%m]>0){
              if(j%n==0){
                  //出圈
                  System.out.println(a[i%m]+"");
                  a[i%m]=-1;
                  j=1;
                  i++;
                  len--;
              }else{
                 i++;
                 j++;
              }
          }else{
            //遇到空位了，就跳到下一位，但j不加1
              i++;
        }
        }
    }
}
