package dataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午3:46
 * To change this template use File | Settings | File Templates.
 */
public class GetSameSunStr {
    /*
    * 得到两个字符串中的公共子串
    */
    public static void getSameSubStr(String s1,String s2){
        List<String> sub1=new ArrayList<String>();
        List<String> sub2=new ArrayList<String>();
        Set<String> result=new HashSet<String>();
        //求s1的子串
        for(int i=1;i<s1.length();i++){
            for(int j=0;j<=s1.length()-i;j++){
                sub1.add(s1.substring(j,j+i));
            }
        }
        //求s2的子串
        for(int i=1;i<s2.length();i++){
            for(int j=0;j<s2.length()-i;j++){
                sub2.add(s2.substring(j,j+i));
            }
        }
         System.out.println(s1+"的子串:"+sub1);
         System.out.println(s2+"的子串:"+sub2);
        for(String s:sub1){
            if(sub2.contains(s))
                result.add(s);
        }
        for(String s:sub2){
            if(sub1.contains(s))
                result.add(s);
        }
        System.out.println("相同的子串:"+result);
    }
    public static void main(String[] args){
        String s1="AABBC";
        String s2="ABBCC";
        getSameSubStr(s1,s2);
    }
}
