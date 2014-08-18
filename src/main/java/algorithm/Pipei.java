package algorithm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午10:48
 * To change this template use File | Settings | File Templates.
 */
public class Pipei {
    public static boolean pipei(String s,String regex){
        boolean flag=false;
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        while (m.find()){
           flag=true;
        }
        return flag;
    }
    public static void main(String[] args){
        String regex=".*.sina.com";
        String s="sports.sina.com";
        System.out.println(pipei(s,regex));
    }
}
