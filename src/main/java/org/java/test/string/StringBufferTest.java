package org.java.test.string;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午8:34
 * To change this template use File | Settings | File Templates.
 */
public class StringBufferTest {
    public static void main(String[] args){
        String[] strings={"a","b","c","d"};
        StringBuffer stringBuffer=new StringBuffer();
        for(String string:strings){
            stringBuffer.append(string);
        }
        System.out.println(stringBuffer.toString());
    }
}
