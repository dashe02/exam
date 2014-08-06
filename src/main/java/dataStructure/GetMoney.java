package dataStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午10:09
 * To change this template use File | Settings | File Templates.
 */
public class GetMoney {
     public static void getMoney(String s){
         String[] a=s.split(",");
         List<String> list=new ArrayList<String>();
         for(int i=1;i<a.length;i++){
             for(int j=0;j<=a.length-i;j++){
                  list.add(s.substring(j,j+i));
             }
         }
         System.out.println(list);
     }
    public static void main(String[] args){
        String s="100,50,10,5,2,1";
        getMoney(s);
    }
}
