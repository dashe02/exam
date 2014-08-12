package cal;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-12
 * Time: 下午5:18
 * To change this template use File | Settings | File Templates.
 */
public class GetMi {
    public static int getMi(int a,int n){
        int b=1;
        for(int i=0;i<n;i++){
          b*=a;
        }
        return b;
    }
    public static void main(String[] args){
        int a=3,b=5;
        System.out.println(getMi(a,b));
    }
}
