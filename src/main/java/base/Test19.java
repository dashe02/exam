package base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午10:33
 * To change this template use File | Settings | File Templates.
 */
public class Test19 {
    public static void removeSubStr(String s,String sub){
        List<String> l=new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            l.add(s.substring(i,i+1));
        }
        for(int j=0;j<sub.length();j++){
        if(l.contains(sub.substring(j,j+1))){
            l.remove(sub.substring(j,j+1));
        }
        }
        for(String s1:l)
        {
            System.out.print(s1);
        }
    }
    public static void main(String[] args){
        String s="abcdefgh";
        String sub="abc";
        removeSubStr(s,sub);
    }
}
