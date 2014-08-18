package algorithm;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-14
 * Time: 上午11:27
 * To change this template use File | Settings | File Templates.
 */
public class StackSequence {
    private static Stack<String> stack=new Stack<String>();   //栈
    private static Stack<String> list=new Stack<String>();    //待装入栈的序列,也用栈来实现
    private static StringBuffer out=new StringBuffer();  //输出串

    public static void recur(){    //递归方法
        if(stack.empty()&&list.empty()){  //栈空,序列也空,则输出
           System.out.println(out);
            return;
        }else if(!stack.empty()&&!list.empty()){ //栈和序列都不空,要么入栈要么出栈
            //1.出栈
            String str=stack.pop();
            out.append(str);
            recur();
            out.deleteCharAt(out.length()-1);
            //2.入栈,注意在入栈之前,应该把之前由于出栈而对out,stack,list造成的影响复原
            stack.push(str);
            str=list.pop();
            stack.push(str);
            recur();
            str=stack.pop();  //入栈操作完后也得复原
            list.push(str);
        }else if(!stack.empty()&&list.empty()){
           String str=stack.pop();
            out.append(str);
            recur();
            //复原
            out.deleteCharAt(out.length()-1);
            stack.push(str);
        }else if(stack.empty()&&list.empty()){
            String str=list.pop();
            stack.push(str);
            recur();
            //复原
            str=stack.pop();
            list.push(str);
        }
    }
    public static void main(String[] args){
        list.push("5");
        list.push("4");
        list.push("3");
        list.push("2");
        list.push("1");
        recur();
    }




}
