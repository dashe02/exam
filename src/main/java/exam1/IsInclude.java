package exam1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-4
 * Time: 下午8:43
 * To change this template use File | Settings | File Templates.
 */
public class IsInclude {
        public static HashSet<String> prepareExecute(String s){
                HashSet<String> m=new HashSet<String>();
                  for(int i=0;i<s.length();i++){
                      String s1=s.substring(i,i+1);
                      m.add(s1);
                  }
            return m;
        }
     public static boolean isInclude(String s,String sub){
              HashSet<String> m=prepareExecute(s);
              int count=0;
              for(int i=0;i<sub.length();i++){
                  String s1=sub.substring(i,i+1);
                  if(m.contains(s1)) {
                      count++;
                  }
              }
         if(count==sub.length()){
             return true;
         }else{
         return false;
         }
     }
    public static void main(String[] args){
        String s="ABCDEFGHLMNOPQRS";
        String sub="DCGSRQPZ";
        System.out.println(isInclude(s,sub));
    }
}
