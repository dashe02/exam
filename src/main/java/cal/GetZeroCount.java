package cal;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午4:02
 * To change this template use File | Settings | File Templates.
 */
public class GetZeroCount {
    //对输入的正整数N,求N！的尾部连续0的个数
    public static long getN(int N){
       if(N==1){
           return 1;
       }
       return N*getN(N-1);
    }
    public static int getZeroCount(int N){
        long n=getN(N);
        String s=String.valueOf(n);
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            String s1=s.substring(i,i+1);
            if(s1.equals("0")){
               count++;
            }else{
               break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int n=18;
        System.out.println(getZeroCount(n));
    }
}
