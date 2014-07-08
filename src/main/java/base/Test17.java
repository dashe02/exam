package base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午9:03
 * To change this template use File | Settings | File Templates.
 */
public class Test17{
    public static void filterString(String s){
        String result="";
        List<String> data=new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            String ss=s.substring(i,i+1);
            if(!data.contains(ss)){
                data.add(ss);
            }
        }
        for(int i=0;i<data.size();i++){
            result+=data.get(i);
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        String s="abacacde";
        filterString(s);
    }
}
