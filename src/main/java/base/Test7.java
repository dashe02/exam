package base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午2:01
 * To change this template use File | Settings | File Templates.
 */
public class Test7 {
    public static void judgeHuiWen(String s){
        StringBuilder sb=new StringBuilder(s);
        String ssb=sb.reverse().toString();
        if(s.equals(ssb)){
            System.out.println("s 是回文数!");
        }else{
            System.out.println("s 不是回文数!");
        }
    }
   /* public static void judegeHuiwen(String s,int n){
        int m=0,temp;
        temp=n;
        while (temp>0){
        m%=10;
        m+=temp%10;
        temp=temp/10;
        }
        if(m==n){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }*/
    public static void main(String[] args){
        String s="121";
        judgeHuiWen(s);
    }
}
