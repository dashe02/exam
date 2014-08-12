package cal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-11
 * Time: 下午8:13
 * To change this template use File | Settings | File Templates.
 */
public class getSub {

     public static void getSub(String[] a){
         StringBuilder sb=new StringBuilder();
          for(int i=0;i<a.length;i++){
              sb.append(a[i]);
          }
         String s=sb.toString();
         List<String> l=new ArrayList<String>();
         for(int i=1;i<=s.length();i++){
             for(int j=0;j<=s.length()-i;j++){
                  l.add(s.substring(j,j+i));
             }
         }
         System.out.println(l);
     }
      public static void main(String[] args){
            String[] s={"a","b","c"};
            getSub(s);
      }
}
