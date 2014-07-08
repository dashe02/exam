package base;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 上午9:48
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void filterString(String s){
        String[] ss=s.split(",");
        for(int i=0;i<ss.length;i++){
            for(int j=0;j<ss.length-i-1;j++){
                if(ss[j].compareTo(ss[j+1])>0){
                     String temp=ss[j];
                     ss[j]=ss[j+1];
                     ss[j+1]=temp;
                }
            }
        }
        Set<String> h=new HashSet<String>();
        for(int i=0;i<ss.length;i++){
            h.add(ss[i]);
        }
        System.out.println(h.size()-2);
    }
    public static void main(String[] args){
        String s="3,4,5,3,6,8,7,9";
        filterString(s);
    }
}
