package calculator;

import java.util.HashMap;
/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 上午7:49
 * To change this template use File | Settings | File Templates.
 * 以最快的方式找出一个字符串中第一个出现一次的字符
 */
public class GetOnce {
    public static HashMap<String,Integer> pre(String s){
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        for(int i=0;i<s.length();i++){
            int count=1;
               String s1=s.substring(i,i+1);
               if(map.containsKey(s1)){
                     count++;
               }
               map.put(s1,count);
        }
        return map;
    }
    public static String getOnce(String s){
        String v=null;
        HashMap<String,Integer> m=pre(s);
        for(int i=0;i<s.length();i++){
            String s1=s.substring(i,i+1);
            if(m.get(s1)==1){
                v=s1;
                break;
            }
        }
         return v;
    }
    public static void main(String[] args){
        String s="abaccdeff";
        System.out.println(getOnce(s));
    }
}
