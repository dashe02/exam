package calculate;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-11
 * Time: 下午10:20
 * To change this template use File | Settings | File Templates.
 */
public class FibonacciX {
    // 一只青蛙一次可以跳上1级台阶,也可以跳上2级,求该青蛙跳上一个n级的台阶有多少种跳法
    public static int Fib(int n){
        if(n<=0)
        {
            return -1;
        }
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else{
            return Fib(n-1)+Fib(n-2);
        }
    }
    public static void main(String[] args){
        System.out.println(Fib(4));
    }
}
