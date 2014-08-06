package dataStructure;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 上午10:11
 * To change this template use File | Settings | File Templates.
 */
public class IsPattern {
    public static boolean isPattern(String s,String regex){
        boolean flag=false;
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        while(m.find()){
            flag=true;
        }
        return flag;
    }
    public static void main(String[] args){
        String s="John Smith";
        String regex="[J.*Smi??]";
        System.out.println(isPattern(s,regex));
    }
}
