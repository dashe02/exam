package cal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-10
 * Time: 下午9:31
 * To change this template use File | Settings | File Templates.
 */
public class TestC {
    public static boolean pipei(String s,String regex){
        boolean flag=false;
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        while(m.find()){
           flag=true;
        }
        return flag;
    }
    public static void main(String[] args){
        String s="aEbc";
        String regex="ab?c";
        System.out.println(pipei(s,regex));
    }
}
