package org.whut.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-17
 * Time: 下午10:22
 * To change this template use File | Settings | File Templates.
 */
public class Test7 {
    public void revereArr(int a[]){
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args){
        int a[]={1,5,2,9,6,0,3};
        new Test7().revereArr(a);
    }
}
