package regex;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-4
 * Time: 上午10:06
 * To change this template use File | Settings | File Templates.
 */
public class StringTest3 {

    public static Map<Integer,Integer> prepareExecute(int[] a){
          Map<Integer,Integer> map=new HashMap<Integer, Integer>();
          for(int i=0;i<a.length-1;i++){
             int count=getCount(a,a[i]);
             map.put(a[i],count);
          }
        return map;
    }
    public static int getCount(int[] a,int x){
       int count=0;
       for(int i=0;i<a.length;i++){
           if(a[i]==x){
                 count++;
           }
       }
        return count;
    }
    public static void main(String[] args){
          int[] a={3,4,3,2,-1,3,3,3};
          prepareExecute(a);
          Map<Integer,Integer> map=prepareExecute(a);
          for(Map.Entry m:map.entrySet()){
              if(Integer.parseInt(String.valueOf(m.getValue()))>a.length/2){
                  System.out.println(m.getKey());
              }else{
                  System.out.println("-1");
              }
          }
    }
}
