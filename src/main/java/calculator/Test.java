package calculator;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-3
 * Time: 下午3:30
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static int add(int a,int b){
        int sum=a^b;
        int array=a&b;
        while(array!=0){
            a=sum;
            b=array<<1;
            sum=a^b;
            array=a&b;
        }
        return sum;
    }
    public static int opperate(int n){
        return add(~n,1);
    }
    public static int sub(int a,int b){
        return add(a,opperate(b));
    }
    public static void main(String[] args){
        int a=15,b=10;
        System.out.println(sub(a,b));
    }
}
