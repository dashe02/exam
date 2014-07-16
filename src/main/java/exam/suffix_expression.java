package exam;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-14
 * Time: 下午5:53
 * To change this template use File | Settings | File Templates.
 */
public class suffix_expression {
    public static void main(String[] args){
        String str="10+2*5";
        System.out.println(suffix_expression(str));
    }
    public static String suffix_expression(String expression){       //中缀表达式转换为后缀表达式
        Stack<Object> s3=new Stack<Object>(); //存放结果栈
        Stack<Character> s4=new Stack<Character>();//存放操作数
        int len=expression.length();
        char c1;
        double number;
        int m,n=-1;
        for(int i=0;i<len;i++)
        {
            c1=expression.charAt(i);
            if(isOperator(c1)||(i==len-1)){
                 if(i==len-1&&(!isOperator(c1)))
                     m=i+1;
                else
                     m=i;
                for(int j=i-1;j>=0;i--){
                    if(isOperator(expression.charAt(j)))
                    {
                        n=j;
                        break;
                    }
                    n=j-1;
                }
                if(m!=n+1)    //只有当这两个值不等时中间才会有操作数
                {
                    number=Double.parseDouble(expression.substring(n+1,m));
                    s3.push(number);
                }
                //运算符入栈左括号
                if(i==0&&(c1!='('))//当表达式第一个字符就为运算符且不是左括号时,返回表达式错误
                {
                    return "表达式错误!";
                }else if(isOperator(c1))//且是操作符时
                {
                    while(true)
                    {
                        if(s4.isEmpty()||s4.peek()=='('||c1==')') //如果栈为空或者栈顶元素为(或者c1为(时,则直接将运算符压入栈内){
                        {s4.push(c1);
                        break;
                        }else if(c1==')')  //当c1为）时,依次弹出s4中的运算符并压入s3，直到(，舍弃这一对括号
                        {
                            while(s4.peek()!='(')
                            {
                               s3.push(s4.pop());
                               if(s4.isEmpty())      //弹出所有不为左括号之后堆栈为空,则表达式不合法
                               {
                                   return "缺少左括号";
                               }
                            }
                            s4.pop();
                            break;
                        } else{
                          if(priorityCompare(c1,s4.peek())==1)    //判断优先级,优先级高入栈,优先级低将栈顶运算符压入s3
                          {
                              s4.push(c1);
                              break;
                          }else{
                              s3.push(s4.pop());
                          }
                        }
                    }
                }
            }else
                continue;
        }
        while (!s4.isEmpty())
        {
            if((char)s4.peek()=='(')
                return "缺少右括号";
            s3.push(s4.pop());
        }
        return count_result(s3);
    }
    private static int priorityCompare(char c1,char c2){
        switch(c1)
        {
            case '+':
            case '-':
                return (c2=='*'||c2=='/'?-1:0);
            case '*':
            case '/':
                return (c2=='+'||c2=='-'?1:0);
        }
        return 1;
    }
    private static boolean isOperator(Object c){
        try{
            char c1=(Character)c;
            if(c1=='+'||c1=='-'||c1=='*'||c1=='/'||c1=='('||c1==')')
                return true;
        }catch(Exception e){
           return false;
        }
        return false;
    }
    private static String count_result(Stack<Object> ob){
        Stack<Object> s1=new Stack<Object>();  //后缀表达式
        Stack<Double> s2=new Stack<Double>();  //操作数栈
        while (!ob.isEmpty())     //将传入的栈逆序压入
        {
          s1.push(ob.pop());
        }
        while(!s1.isEmpty())
        {
            if(!isOperator(s1.peek()))
            {
                s2.push((Double)s1.pop());
            }else
            {
                s2.push(cout(s2.pop(),s2.pop(),(Character)s1.pop()));
            }
        }
          return Double.toString(s2.peek());
    }
    private static Double cout(double s1,double s2,char s3){
        double result=0;
        switch(s3){
            case '+':
                result=s1+s2;
                break;
            case '-':
                result=s1-s2;
                break;
            case '*':
                result=s1*s2;
                break;
            case '/':
                result=s1/s2;
                break;
        }
        return result;
    }
}
