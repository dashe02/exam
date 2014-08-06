package calculator;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-3
 * Time: 下午11:23
 * To change this template use File | Settings | File Templates.
 */
public class Test4 {
    public static int gongyue(int max,int min){
         while(max%min!=0){
             int temp=max%min;
             max=min;
             min=temp;
         }
           return min;
    }
    public static void gongbei(int max,int min){
         System.out.println(max*min/gongyue(min,max));
    }
    public static void main(String[] args){
        int a=12,b=48;
        System.out.println(gongyue(a,b));
        gongbei(a,b);
    }
}
