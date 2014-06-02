package org.java.test.string;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午8:40
 * To change this template use File | Settings | File Templates.
 */
public class StringTest {
    public static void main(String[] args){
        String[] s={"a","b","c","d"};
        StringBuffer sb=new StringBuffer();
        for(int i=s.length-1;i>=0;i--){
           sb.append(s[i]);
        }
        System.out.println(sb.toString());
    }
}
