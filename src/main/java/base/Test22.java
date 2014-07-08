package base;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-5
 * Time: 下午10:36
 * To change this template use File | Settings | File Templates.
 */
public class Test22 {
    public static void filter(String s){
        List<String> l=new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            String ss=s.substring(i,i+1);
            l.add(ss);
        }
        for(int i=0;i<l.size()-1;i++){
            if(!l.get(i).equals("*")){
             if((judgeIsNumber(l.get(i))&&!judgeIsNumber(l.get(i+1)))||(!judgeIsNumber(l.get(i))&&judgeIsNumber(l.get(i+1)))){
                 l.add(i+1,"*");
             }
            }
        }
        if(judgeIsNumber(l.get(0))) {
            l.add(0,"*");
        }
        if(judgeIsNumber(l.get(l.size()-1))){
            l.add(l.size(),"*");
        }
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i));
        }
    }
    public static boolean judgeIsNumber(String s){
        String regex="[0-9]";
        boolean f=false;
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        while (m.find()){
            f=true;
        }
        return f;
    }
    public static void main(String[] args){
        String s="e2e3rer2y";
        filter(s);
    }
}
