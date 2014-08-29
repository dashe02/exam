package algorithm.sort.exam;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-19
 * Time: 下午7:46
 * To change this template use File | Settings | File Templates.
 */
public class GetDuiChenSum {
    public static boolean getDuiChen(String s){
        boolean flag=false;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.substring(i,i+1));
        }
        if(s.equals(sb.reverse().toString())){
            flag=true;
        }
        return flag;
    }
    public static List<String> getSubString(String s){
        List<String> list=new ArrayList<String>();
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<=s.length()-i;j++){
                list.add(s.substring(j,j+i));
            }
        }
        return list;
    }
    public static void getDuiChenSub(String s){
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        List<String> list=getSubString(s);
        for(int i=0;i<list.size();i++){
             if(getDuiChen(list.get(i))){
                map.put(list.get(i), list.get(i).length());
             }
        }
    }
    public static void main(String[] args){
           String s="asderwsde";
           //getDuiChenSub(s);
           int count=0;
           List<String> l=getSubString(s);
           for(int i=0;i<l.size();i++){
               if("sde".equals(l.get(i))){
                   count++;
               }
           }
           System.out.println(count);
    }
}
