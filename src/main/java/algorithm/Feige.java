package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 上午9:13
 * To change this template use File | Settings | File Templates.
 */
public class Feige {
    public static void fenge(String s){
        TreeMap<String,String> map=new TreeMap<String, String>();
        String[] s1=s.split(":");
        map.put("protocal",s1[0]);
        String sss=s1[1].substring(2,s1[1].length());
        String[] s2=sss.split("/");
        map.put("hostname",s2[0]);
        String[] s3=s2[1].split("\\?");
        map.put("pathname","/"+s3[0]);
        map.put("query",s3[1]);
        StringBuilder sb=new StringBuilder();
        sb.append("{"+"\n");
        for(Map.Entry m:map.entrySet()){
            sb.append("'"+m.getKey()+"':'"+m.getValue()+"',\n");
        }
        sb.append("}");
        System.out.println(sb.toString());
    }
    public static void main(String[] args){
        String s="http://www.qq.com/index.html?key1=1&key2=2&key3=3";
        fenge(s);
    }
}
