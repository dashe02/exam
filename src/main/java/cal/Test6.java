package cal;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-14
 * Time: 上午9:47
 * To change this template use File | Settings | File Templates.
 */
public class Test6 {
    public static int Test6(int n){
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
        int n=5;
        System.out.println(Test6(n));
    }
}
