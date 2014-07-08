package base;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午3:58
 * To change this template use File | Settings | File Templates.
 */
public class Test10 {
   public static void getSort(int a){
       String s=String.valueOf(a);
       StringBuilder sb=new StringBuilder(s);
       StringBuilder sb1=new StringBuilder();
       String ss=sb.reverse().toString();
       if(ss.contains("0")){
       for(int i=0;i<ss.length()-1;i++){
           sb1.append(ss.charAt(i+1));
       }
       System.out.print(sb1.toString());
       }else{
       System.out.println(ss);
       }
   }
    public static void main(String[] args){
        int a=-175;
        getSort(a);
    }
}
