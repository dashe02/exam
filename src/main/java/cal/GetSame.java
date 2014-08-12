package cal;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-12
 * Time: 下午5:12
 * To change this template use File | Settings | File Templates.
 */
public class GetSame {
  public static Set<Integer> pre(int[] a){
      Set<Integer> s=new HashSet<Integer>();
      for(int i=0;i<a.length;i++){
          s.add(a[i]);
      }
      return s;
  }
  public static void getSame(int[] a,int[] b){
      Set<Integer> s=pre(a);
      for(int i=0;i<b.length;i++){
       if(s.contains(b[i])){
           System.out.println(b[i]);
       }
      }
  }
 public static void main(String[] args){
     int[] a={1,4,6,9,0};
     int[] b={1,5,7,8,0};
     getSame(a,b);
 }
}
