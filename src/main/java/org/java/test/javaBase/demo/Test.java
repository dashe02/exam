package org.java.test.javaBase.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-24
 * Time: 下午12:55
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public Set<String> getMerge(int[] a,int target){
        //找出a数组中之后为target的组合
        Set<String>result=new HashSet<String>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target){
                result.add(a[i]+"");
            }
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    result.add(a[i]+"-"+a[j]);
                }
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==target){
                        result.add(a[i]+"-"+a[j]+"-"+a[k]);
                    }
                }
            }
        }
       return result;
    }
    public static void main(String[] args){
        Test test=new Test();
        int[] a={4,3,2,2,1,1};
        Set<String> l=test.getMerge(a,4);
        for(String str:l){
            System.out.println(str);
        }
    }
}
