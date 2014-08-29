package mianshibaodian;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-26
 * Time: 上午10:30
 * To change this template use File | Settings | File Templates.
 */
/*
 题目说明:有一个整数n，写一个函数f(n)，返回0~n之间出现的"1"的个数
 解决:关键在与效率,在没有发现很科学的,快速的计算出个数的情况下,可以采用缓存的机制,可以把前面的计算结果缓存下来,把每次的结果保存好,就不用每次都重新计算
*/
public class Test {
    static int getOnly(int num){
       int number=0;
       String s=num+"";
       int len=s.length();
        if(len!=0){
            for(int i=0;i<len;i++){
                char a=s.charAt(i);
                if(a=='1')
                {
                    number++;
                }
            }
        }
        return number;
    }
    public static void main(String[] args){
        int n=13;
     /*   int res=1;
        while((getOnly(n)+res)!=n){
            res+=getOnly(n);
            ++n;
        }*/
        int sum=0;
        for(int i=1;i<=n;i++){
             sum+=getOnly(i);
        }
        System.out.println(sum);
    }
}
