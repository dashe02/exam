package dataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午3:58
 * To change this template use File | Settings | File Templates.
 */
public class GetSameSubStr2 {
    public static void getSameSubStr2(String s1,String s2){

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
        System.out.println(s1 + "的子串是:" + sub1);
        System.out.println(s2+"的子串是:"+sub2);
        for(String s:sub1){
            if(sub2.contains(s)){
                result.add(s);
            }
        }
        for(String ss:sub2){
            if(sub1.contains(ss)){
                result.add(ss);
            }
        }
        System.out.println("相同的子串:" + result);
    }
    public static void main(String[] args){
        String s1="AABBC";
        String s2="ABBCC";
        getSameSubStr2(s1,s2);
    }
}
