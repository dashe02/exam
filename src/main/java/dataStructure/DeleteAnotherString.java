package dataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 上午9:52
 * To change this template use File | Settings | File Templates.
 */
public class DeleteAnotherString {

    public static String deleteAnotherString(String s1,String s2) {
        List<String> list=new ArrayList<String>();
        for(int i=0;i<s1.length();i++){
            String s=s1.substring(i,i+1);
            list.add(s);
        }
        Map<String,String> map=new HashMap<String, String>();
        for(int i=0;i<s2.length();i++){
            String ss1=s2.substring(i,i+1);
            map.put(ss1,ss1);
        }
        for(int i=0;i<s1.length();i++){
           String ss2=s1.substring(i,i+1);
           if(map.containsKey(ss2)){
               list.remove(ss2);
           };
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s1="They are students.";
        String s2="aeiou";
        System.out.println(deleteAnotherString(s1, s2));
    }
}
