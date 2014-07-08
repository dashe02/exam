package base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午11:05
 * To change this template use File | Settings | File Templates.
 */
public class Test21 {
    public static void transfer(String s){
        List<String> l=new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            l.add(s.substring(i,i+1));
        }
    }
}
