package org.java.test.javaBase.demo;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-25
 * Time: 下午4:41
 * To change this template use File | Settings | File Templates.
 */
public class Demo4 {
      public static void inputScore(){
          Scanner scanner=new Scanner(System.in);
          System.out.println("请输入要录入成绩的个数:");
          int n=scanner.nextInt();
          System.out.println("请输入学号和成绩:用空格连接");
          String[] a=new String[n];
          for(int i=0;i<a.length;i++){
                  a[i]=scanner.next();
          }
              int avg=getAverage(a);
              System.out.println("平均成绩:"+avg);
              getUpperAvg(avg, a);
      }
    public static int getAverage(String[] a){
        int sum=0;
         for(int i=0;i<a.length;i++){
             String[] str=a[i].split("-");
             sum+=Integer.parseInt(str[1]);
         }
         return sum/a.length;
    }
     public static void getUpperAvg(int avg,String[] a){
         List<Map<String,String>> list=new ArrayList<Map<String, String>>();
         for(int i=0;i<a.length;i++){
            String[] str=a[i].split("-");
            if(Integer.parseInt(str[1])>avg){
                Map<String,String> map=new HashMap<String, String>();
                map.put("result",a[i]);
                list.add(map);
            }
         }
         for(Map<String,String> m:list){
             System.out.println(m.get("result"));
         }
     }
    public static boolean filter(String str){
        boolean flag=false;
        String regex="[1-9]-[1-9]";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);
        while (m.find()){
            flag=true;
        }
        return flag;
    }
    public static void main(String[] args){
        Demo4 d4=new Demo4();
        d4.inputScore();
       // System.out.println(filter("001 100"));
    }
}
