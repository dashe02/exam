package base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午6:58
 * To change this template use File | Settings | File Templates.
 */
public class Test13 {
    public static void get(int a){
         String s=Integer.toBinaryString(a);
         String rs="";
         if(s.length()<32){
            int len=32-s.length();
            for(int i=0;i<len-1;i++){
                 rs+="0";
            }
             rs+=s;
         }
         System.out.println(rs);
    }
    public static void main(String[] args){
         int a=10;
         get(a);
    }
}
