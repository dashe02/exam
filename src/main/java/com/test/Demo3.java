package com.test;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 下午10:11
 * To change this template use File | Settings | File Templates.
 */
public class Demo3 {
    public void drawColor(){
        int[][] a=initArray();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                int x=a[i][j]%4;
                if(x==0){
                    System.out.println(a[i][j]+"--red");
                }else if(x==1){
                    System.out.println(a[i][j]+"--blue");
                }else if(x==2){
                    System.out.println(a[i][j]+"--green");
                }else if(x==3){
                    System.out.println(a[i][j]+"--black");
                }
            }
        }

    }
    public int[][] initArray(){
        int[][] a=new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                Random ran=new Random();
                a[i][j]=ran.nextInt();
            }
        }
        return a;
    }
    public static void main(String[] args){
        Demo3 d3=new Demo3();
        d3.drawColor();
    }
}
