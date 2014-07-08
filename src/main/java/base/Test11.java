package base;

import sun.reflect.generics.tree.ArrayTypeSignature;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午4:31
 * To change this template use File | Settings | File Templates.
 */
public class Test11 {
    public static void re(int a){
    if(a>0){
     System.out.println(getValue(a));
     }else{
     String ss=getValue(Math.abs(a));
     System.out.println("-"+ss);
    }
    }
    public static String removeRepeat(String s){
        List<String> data=new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            String ss=s.substring(i,i+1);
            if(!data.contains(ss)){
                data.add(ss);
            }
        }
        if(data.get(data.size()-1).equals("0")){
              data.remove(data.size()-1);
        }
        String result="";
        for(String s1:data){
            result+=s1;
        }
       return result;
    }
    public static String getValue(int a){
        String s=String.valueOf(a);
        String s1=removeRepeat(s);
        StringBuilder sb=new StringBuilder(s1);
        String s2=sb.reverse().toString();
        return s2;
    }
    public static void main(String[] args){
      int s=-175;
      re(s);
    }
}
