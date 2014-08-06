package dataStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午9:05
 * To change this template use File | Settings | File Templates.
 */
public class GetSomeSub {
    public static void getSomeSub(String s){
        List<String> sub1=new ArrayList<String>();
        for(int i=1;i<s.length();i++){
            for(int j=0;j<=s.length()-i;j++){
                sub1.add(s.substring(j,j+i));
            }
        }
        System.out.println(sub1);
        for(int i=0;i<sub1.size();i++){
            String ss=sub1.get(i);
            int count=0;
            for(int j=0;j<ss.length();j++){
                count+=Integer.parseInt(ss.substring(j,j+1));
            }
            if(count%3==0){
                System.out.println(ss);
            }
        }
    }
    public static void main(String[] args){
        String s="012345";
        getSomeSub(s);
    }
}
