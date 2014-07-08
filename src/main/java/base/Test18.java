package base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午9:25
 * To change this template use File | Settings | File Templates.
 */
public class Test18 {
    public static void compressString(String s){
        List<String> l=new ArrayList<String>();
        List<String>ll=new ArrayList<String>();
        for(int i=0;i<s.length();i++){
           String ss=s.substring(i,i+1);
           if(!l.contains(ss)){
              l.add(ss);
           }
        }
        for(int j=0;j<l.size();j++){
            int count=0;
        for(int i=0;i<s.length();i++){
            boolean d=(l.get(j).equals(s.substring(i,i+1)));
             if(l.get(j).equals(s.substring(i,i+1))){
                 count++;
             }
        }
            if(count>1){
                ll.add(count+""+l.get(j));
            }else if(count==1){
                ll.add(""+l.get(j));
            }

        }
        String result="";
        for(String sq:ll) {
            result+=sq;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
          String s="adef";
          compressString(s);
    }
}
