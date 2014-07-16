package calculate;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-11
 * Time: 下午9:41
 * To change this template use File | Settings | File Templates.
 */
public class Calculate {
    //不使用加减乘除来实现加减乘除
       public static int Add(int a,int b){
          return b==0?Add(a^b,(a&b)<<1):a;
       }
       public static int Minus(int a,int b){
          return 0;
       }
       public static void main(String[] args){
           System.out.println(Add(1,2));
       }
}
