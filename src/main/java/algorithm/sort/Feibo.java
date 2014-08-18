package algorithm.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午11:47
 * To change this template use File | Settings | File Templates.
 */
public class Feibo {
    public static int feibo(int n){
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
        int n=3;
        System.out.println(feibo(n));
    }
}
