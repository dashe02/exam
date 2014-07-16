package daily;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 下午10:56
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
       int a=120209;
       String s=Integer.toBinaryString(a);
       String s1=Integer.toHexString(a);
       System.out.println(s1);
    }
    public static void getCount(String s){
        int count=0;
        for(int i=0;i<s.length()-1;i++){
           if(s.charAt(i+1)==s.charAt(i)){
               count++;
           }else{
               count=0;
           }

        }
    }
}
