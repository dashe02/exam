package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-14
 * Time: 上午9:33
 * To change this template use File | Settings | File Templates.
 */
public class FeiBoLaQie {
    public static long feibolaqie(int n){
        long a=1;
        long b=1;
        if(n==1)
            return a;
        if(n==2)
            return b;
        for(int i=0;i<n-2;i++){
            long temp=a+b;
            a=b;
            b=temp;
            System.out.println(b);
        }
        return b;
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(feibolaqie(n));
    }
}
