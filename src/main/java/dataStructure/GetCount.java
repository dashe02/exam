package dataStructure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 上午10:24
 * To change this template use File | Settings | File Templates.
 */
public class GetCount {
    public static Map<String,Integer> pre(String s){
        Map<String,Integer> m=new HashMap<String, Integer>();
        for(int i=0;i<s.length();i++){
            int count=1;
            String s1=s.substring(i,i+1);
            if(m.containsKey(s1)){
                count++;
            }
            m.put(s1,count);
        }
        return m;
    }
    public static void getCount(String s){
          Map<String,Integer> m=pre(s);
          for(int i=0;i<s.length();i++){
              String s1=s.substring(i,i+1);
              System.out.println(s1+",个数:"+m.get(s1));
          }
    }
    public static void main(String[] args){
        String s="AbcABca";
        getCount(s);
    }
}
