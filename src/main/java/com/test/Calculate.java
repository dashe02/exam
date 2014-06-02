package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-28
 * Time: 下午8:53
 * To change this template use File | Settings | File Templates.
 */
public class Calculate {
    public static int result;

    public void add(int n){
        result=result+n;
    }
    public void substract(int n){
        result=result-n;
    }
    public void multiply(int n){

    }
    public void divide(int n){
        result=result/n;
    }
     public void square(int n){
         result=n*n;
     }
     public void squareRoot(int n){
         for(;;);
     }
     public void clear(){
         result=0;
     }
      public int getResult(){
          return result;
      }
}
