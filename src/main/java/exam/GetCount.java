package exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-14
 * Time: 上午10:45
 * To change this template use File | Settings | File Templates.
 */
public class GetCount {
    public static void getCount(int n){
        int count=0;
         for(int i=1;i<=n;i++){
             if(n%i==0){
                 count++;
         }
         }
        System.out.println(count);
    }
    public static void main(String[] args){
        getCount(8);
    }
}
