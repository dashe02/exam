package base.blacket;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 上午11:07
 * To change this template use File | Settings | File Templates.
 */
public class Stack {
    public static void push(char[] arr,int topOfStack,char x){
        arr[topOfStack]=x;
    }
    public static char pop(char[] arr,int topOfStack){
        char x=arr[topOfStack];
        return x;
    }



}
