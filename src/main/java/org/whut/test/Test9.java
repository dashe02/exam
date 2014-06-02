package org.whut.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-17
 * Time: 下午10:31
 * To change this template use File | Settings | File Templates.
 */
public class Test9 {
    public List<String> ReadFile(){
        File f=new File("F://read//test1.txt");
        List<String>list=new ArrayList<String>();
        try{
        InputStream in=new FileInputStream(f);
        BufferedInputStream buf=new BufferedInputStream(in);
        byte[] b=new byte[1024];
        while((buf.read(b))!=-1){
            String s=new String(b,"gb2312");
            //System.out.println(s);
            String[] s1=s.split("\r\n");
            for(int i=0;i<s1.length-1;i++){
                for(int j=0;j<s1.length-i-1;j++){
                boolean f1=compare(s1[j],s1[j+1]);
                if(f1){
                    list.add(s1[j]);
                }else{
                    list.add(s1[j]);
                    list.add(s1[j+1]);
                }
                }
            }
        }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public boolean compare(String t1,String t2){
        boolean f=false;
        String[] s1=t1.split(",");
        String[] s2=t2.split(",");
        if(s1[1].equals(s2[1])){
           f=true;
        }
        return f;
    }
    public void result(){
        List<String> list=ReadFile();
        for(String s:list){
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        new Test9().result();
    }
}
