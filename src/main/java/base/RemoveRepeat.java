package base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午5:20
 * To change this template use File | Settings | File Templates.
 */
public class RemoveRepeat {
    public static void removeRepeat(String s){
        List<String> data=new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            String x=s.substring(i,i+1);
            if(!data.contains(x)){
                data.add(x);
            }
        }
        String result="";
        for(String dd:data){
            result+=dd;
        }
        System.out.println(result);

    }
    public static void main(String[] args){
        String s="124512";
        removeRepeat(s);
    }
}
