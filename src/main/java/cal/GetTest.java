package cal;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-12
 * Time: 上午10:16
 * To change this template use File | Settings | File Templates.
 */
public class GetTest {
    public static void getTest(String s){
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.substring(i,i+1));
        }
    }
    public static void main(String[] args){
        String s="abcde";
        getTest(s);
    }
}
