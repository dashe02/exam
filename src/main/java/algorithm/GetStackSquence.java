package algorithm;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-14
 * Time: 上午10:46
 * To change this template use File | Settings | File Templates.
 */
public class GetStackSquence {
    //给定一个进栈顺序,输出出栈顺序
    static int count;
    public static void outprint(Stack<Integer> q){
        while (q.size()!=0){
            System.out.println(q.pop() + "->");
            q.pop();
        }
        count++;
    }
     //q存放入栈序列
     //stk用于模拟入栈过程
    //output用于存放可能的出栈序列
    public static void allPopSeq(Stack<Integer> q,Stack<Integer> stk,Stack<Integer>output){
        if((q.size()==0)&&(stk.size()==0)&&output.size()==0&&(output.size()==5)){
            outprint(output);
            return;
        }
        if(q.size()!=0){         //入栈
            int v=q.peek();
            stk.push(v);
            q.pop();
            allPopSeq(q,stk,output);
            stk.pop();
            q.push(v);
        }
        if(stk.size()!=0){ //出栈
            int v=stk.peek();
            stk.pop();
            output.push(v);
            allPopSeq(q,stk,output);
            output.pop();
            stk.push(v);  //回溯恢复
        }
        return;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        Stack<Integer> stkValues=new Stack<Integer>();
        Stack<Integer> stkOutput=new Stack<Integer>();
        Stack<Integer> tmp=new Stack<Integer>();
        int i;
        for(i=0;i!=5;i++){
            stkValues.push(arr[i]);
        }
        allPopSeq(stkValues,tmp,stkOutput);
        System.out.println(count);
    }








}
