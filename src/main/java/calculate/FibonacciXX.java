package calculate;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-11
 * Time: 下午10:30
 * To change this template use File | Settings | File Templates.
 */
public class FibonacciXX {
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级.....它可以跳上n级,此时该青蛙跳上一个n级的台阶总共有多少种跳法.
    //http://blog.csdn.net/silenough/article/details/7184784
    public static int Fib(int n){
        if(n<0){
            return -1;
        }
        else if(n==0){
            return 1;
        }else if(n==1){
            return 1;
        }else{
            return 2*Fib(n-1);
        }
    }
}
