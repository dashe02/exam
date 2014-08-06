package dataStructure;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午6:02
 * To change this template use File | Settings | File Templates.
 */
public class FindTwoNum {
    public static Set<Integer> pre(int[] a,int x){
         Set<Integer> s=new HashSet<Integer>();
         for(int i=0;i<a.length;i++){
            if(x>=a[i]){
                s.add(x-a[i]);
            }
         }
        return s;
    }
    public static void findTwoNum(int[] a,int x){
        Set<Integer> b=pre(a,x);
        for(int i=0;i<a.length;i++){
            if(b.contains(a[i])){
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] a={1,2,4,7,11,15};
        findTwoNum(a,15);
    }
}
