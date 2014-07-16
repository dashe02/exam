package exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-14
 * Time: 上午10:35
 * To change this template use File | Settings | File Templates.
 */
public class PrimeFactor {
       public static  void PrimeFactors(int n){
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
        PrimeFactors(6);
    }
}
