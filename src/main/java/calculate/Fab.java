package calculate;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-11
 * Time: 下午9:53
 * To change this template use File | Settings | File Templates.
 */
public class Fab {
     public static int Fab(int n){
           if(n==1||n==2)
            return 1;
            else
            return Fab(n-1)+Fab(n-2);
     }
    public static void main(String[] args){
        System.out.println(Fab(3));
    }
}
