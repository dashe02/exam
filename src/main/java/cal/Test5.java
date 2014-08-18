package cal;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-14
 * Time: 上午9:36
 * To change this template use File | Settings | File Templates.
 */
public class Test5 {
    public static int test5(int n){
        int a=1;
        int b=1;
        if(n==1)
            return a;
        if(n==2)
            return b;
        for(int i=0;i<n-2;i++){
            int temp=a+b;
            a=b;
            b=temp;
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println(test5(10));
    }
}
