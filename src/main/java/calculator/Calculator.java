package calculator;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-3
 * Time: 下午3:13
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {

    public static int add(int a,int b){
        int sum=a^b;
        int carry=a&b;
        while(carry!=0){
            a=sum;
            b=carry<<1;
            sum=a^b;
            carry=a&b;
        }
        return sum;
    }
    public static int oppositeNumber(int n){
        return add(~n,1);
    }
    public static int sub(int a,int b){
        return add(a,oppositeNumber(b));
    }
     public static void main(String[] args){
         int a=15,b=10;
         System.out.println(sub(a,b));
     }

}
