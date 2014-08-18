package algorithm.sort.yanjiu;

import sun.misc.Unsafe;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午9:49
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static boolean pipei(String s,String regex){
        boolean flag=false;
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        while(m.find()){
           flag=true;
        }
        return flag;
    }
    public  void test(){
        System.out.println("test");
    }
    public static void main(String[] args){
      String s="xxyx";
      String regex="x*(x|yx)";
      System.out.println(pipei(s,regex));
        Unsafe u;
    }
}
