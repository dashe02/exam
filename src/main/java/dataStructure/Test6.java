package dataStructure;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-6
 * Time: 下午9:44
 * To change this template use File | Settings | File Templates.
 */
public class Test6 {
      public static void getNum(int n){
           while(n>1){
               if(isOdd(n)){
                   n=n-1;
                   getNum(n);
               }
               if(isEven(n)){
                    n=n/2;
                    getNum(n);
               }
           }
      }
      public static boolean isOdd(int n){
          //判断奇数
         boolean flag=false;
         if(n%2!=0){
             flag=true;
         }
          return flag;
      }
      public static boolean isEven(int n){
            //判断偶数
           boolean flag=false;
            if(n%2==0){
               flag=true;
            }
          return flag;
      }
      public static void main(String[] args){
             int n=7;
             getNum(n);
      }
}
