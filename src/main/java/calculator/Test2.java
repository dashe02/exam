package calculator;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-3
 * Time: 下午10:34
 * To change this template use File | Settings | File Templates.
 */
public class Test2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int min;
        int max;
        System.out.println("请输入一个数:");
        min=scanner.nextInt();
        System.out.println("请输入另一个数:");
        max=scanner.nextInt();
        System.out.println(gongyue(min,max));
        System.out.println(gongbei(min,max));
    }
    public static int gongyue(int min,int max){
         while(max%min!=0){
             int temp=max%min;
             max=min;
             min=temp;
         }
          return min;
    }
    public static int gongbei(int min,int max){
          return min*max/gongyue(min,max);
    }
}
