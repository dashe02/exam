package base;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午2:23
 * To change this template use File | Settings | File Templates.
 */
public class Test8 {
    public static void filterString(){
        StringBuilder sb=new StringBuilder();
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("输入一行数字:");
        String s1=scanner1.next();
        System.out.println("输入第二行数字:");
        String filterString=scanner2.next();
        String[] ss=s1.split(",");
        for(int i=0;i<ss.length;i++){
            if(filter(ss[i],filterString)){
              sb.append(ss[i]+",");
            }
        }
        System.out.println(sb.toString());
    }
    public static boolean filter(String s,String filter){
          int count=0;
          boolean f=false;
          for(int i=0;i<s.length();i++){
              for(int j=0;j<filter.length();j++){
                  if(s.charAt(i)==filter.charAt(j)){
                      count++;
                  }
              }
          }
        if(count==filter.length()){
             f=true;
        }
        return f;
    }
    public static void main(String[] args){
        filterString();
    }
}
