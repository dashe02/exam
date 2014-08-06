package exam1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-4
 * Time: 下午8:25
 * To change this template use File | Settings | File Templates.
 */
public class LeftRotate {
    public static void leftRotate(String s,int x){   //要旋转的字符串,旋转的数字
       if(x<=s.length()){
           StringBuilder sb=new StringBuilder();
           for(int i=x;i<s.length();i++){
               String s1=s.substring(i,i+1);
               sb.append(s1);
           }
           for(int i=0;i<x;i++){
               String s1=s.substring(i,i+1);
               sb.append(s1);
           }
           System.out.println(sb.toString());
       }else{
           System.out.println("长度超过了字符串长度!");
        }
    }
    public static void main(String[] args){
        String s="abcdef";
        int x=2;
        leftRotate(s,6);
    }

}
