package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-8
 * Time: 下午8:27
 * To change this template use File | Settings | File Templates.
 */
public class GetZuhe {
    public static void getZuhe(String s,int x){
        List<String> list=new ArrayList<String>();
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<=s.length()-i;j++){
                String ss=s.substring(j,j+i);
                list.add(ss);
            }
        }
        System.out.println(list.size());
    }
    public static int Random7(){
          Random random=new Random();
          int x=random.nextInt(7)+1;
          return x;
    }
    public static void Random10(){
         int x=Random7()+3;
         System.out.println(x);
    }
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            Random10();
        }
    }
}
