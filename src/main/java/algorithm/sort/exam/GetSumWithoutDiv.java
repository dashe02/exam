package algorithm.sort.exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-19
 * Time: 下午11:02
 * To change this template use File | Settings | File Templates.
 */
public class GetSumWithoutDiv {
        //求1+2+3+...+n
        public static int add_fun(int n,int sum){
            n&=add_fun(n-1,sum);
            return (sum+=n);
        }
        public static void main(String[] args){
            int sum=0;
            int n=100;
            System.out.println(add_fun(n,sum));
        }
}
