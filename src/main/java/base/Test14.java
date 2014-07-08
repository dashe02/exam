package base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午7:11
 * To change this template use File | Settings | File Templates.
 */
public class Test14 {
    public static void filter(String s){
        List<Character> l=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            l.add(s.charAt(i));
        }
    }
    public static  void main(String[] args){
       String s="233erer23";
       filter(s);
    }
}
