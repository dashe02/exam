package dataStructure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午9:26
 * To change this template use File | Settings | File Templates.
 */
public class GetTwoNum {
    /*
    *  找出数组中除了两个数字之外,其他的数字都出现了两次
    */
    public static Map<Integer,Integer> pre(int[] a){
        Map<Integer,Integer> m=new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++){
            int count=1;
            if(m.containsKey(a[i])){
                count++;
            }
            m.put(a[i],count);
        }
        return m;
    }
    public static void getTwoNum(int[] a){
       Map<Integer,Integer> m=pre(a);
       for(int i=0;i<a.length;i++){
           if(m.get(a[i])==1){
               System.out.println(a[i]);
           }
       }
    }
    public static void main(String[] args){
        int[] a={1,2,3,3,2,8,0,1};
        getTwoNum(a);
    }
}
