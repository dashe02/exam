package org.java.test.base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-13
 * Time: 下午3:31
 * To change this template use File | Settings | File Templates.
 */
public class Test1 {
    public void sort(int n){
        int a[]=new int[(5000/n)+1];
        for(int i=0;i*n<5000;i++){
             a[i]=n*getL(i);
        }
        for(int i=0;i<a.length-1;i++){
            System.out.println(a[i]+",");
        }
        for(int i=a.length-2;i>=0;i--){
            System.out.println(a[i]+",");
        }
    }
    public int getL(int m){
        int x=1;
        for(int i=0;i<m;i++){
             x*=2;
        }
        return x;
    }
    public static void main(String[] args){
        Test1 test1=new Test1();
        test1.sort(1237);
    }

}
