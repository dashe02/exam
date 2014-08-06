package dataStructure;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午10:53
 * To change this template use File | Settings | File Templates.
 */
public class GetZhiYinShu {
   /*
   *  求一个数的质因数
   */
    public static void PrintPrimeFactors(int n){
        for(int i=2;i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
    public static void main(String[] args){
        PrintPrimeFactors(1234567890);
    }
}
