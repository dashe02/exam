package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午6:12
 * To change this template use File | Settings | File Templates.
 */
public class GetStringPipei {
       //假如两个字符串所包含的字符和个数都相同我们就叫这两个字符串匹配
       public static List<String> pre(String a){
           List<String> list=new ArrayList<String>();
           for(int i=0;i<a.length();i++){
               list.add(a.substring(i,i+1));
           }
           return list;
       }
       public static void StringPipei(String a,String b){
            List<String>l=pre(a);
            int count=0;
            for(int i=0;i<b.length();i++){
                String s=b.substring(i,i+1);
                if(l.contains(s)){
                    count++;
                }
            }
           if(count==a.length()){
            System.out.println(a+"与"+b+"匹配!");
           }else{
            System.out.println(a+"与"+b+"不匹配!");
           }
       }
     public static void main(String[] args){
         String a="abcda";
         String b="ababcb";
         StringPipei(a,b);
     }
}
