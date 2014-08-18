package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午3:10
 * To change this template use File | Settings | File Templates.
 */
public class GenerateNum {
    public static int generateNum(int n){
        String s=String.valueOf(n);
        int sum=n;
        for(int i=0;i<s.length();i++){
            sum+=Integer.parseInt(s.substring(i,i+1));
        }
           return sum;
     }
    public static void main(String[] args){
        int n=78;
        System.out.println(generateNum(n));
    }
}
