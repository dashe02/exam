package dataStructure;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午4:25
 * To change this template use File | Settings | File Templates.
 */
public class GetMaxSubStr {
    public static void getMaxSubStr(String s1,String s2){
        List<String> sub1=new ArrayList<String>();
        List<String> sub2=new ArrayList<String>();
        Set<String> result=new HashSet<String>();
        for(int i=1;i<s1.length();i++){
            for(int j=0;j<=s1.length()-i;j++){
                String s=s1.substring(j,j+i);
                sub1.add(s);
            }
        }
        for(int i=1;i<s2.length();i++){
            for(int j=0;j<=s2.length()-i;j++){
                String s=s2.substring(j,j+i);
                sub2.add(s);
            }
        }
        for(String s:sub1){
            if(sub2.contains(s)){
                result.add(s);
            }
        }
        for(String s:sub2){
            if(sub1.contains(s)){
                result.add(s);
            }
        }
        Map<String,Integer> map=new HashMap<String, Integer>();
        for(String s:result){
            map.put(s,s.length());
        }

    }
    public static void main(String[] args){
        String s1="wepiabc";
        String s2="pabcni";
        getMaxSubStr(s1,s2);
    }
}
