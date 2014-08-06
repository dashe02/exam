package dataStructure;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午10:22
 * To change this template use File | Settings | File Templates.
 */
public class GetSomeNum {
    public static HashSet<Integer> pre(int[] a){
        HashSet<Integer> s=new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        System.out.println(s);
        return s;
    }
    public static void getSomeNum(int[] a){
        HashSet s=pre(a);
        for(int i=0;i<a.length;i++){
            if(s.contains(2*a[i])){
                System.out.println(a[i]+":"+2*a[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] a={1,2,4,6,7,8};
        getSomeNum(a);
    }
}
