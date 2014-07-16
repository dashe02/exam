package calculate;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-11
 * Time: 下午10:06
 * To change this template use File | Settings | File Templates.
 */
public class Fibonacci {
    public static int Fibonacci(int n){
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args){
        System.out.println(Fibonacci(3));
    }
}
