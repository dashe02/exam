package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-2
 * Time: 下午10:26
 * To change this template use File | Settings | File Templates.
 */
public class Test2 {
    //给定一个字符串,长度和数到哪个数出列
    public void getString(String s,int m,int len){
        int x=0;
        String[] ss=s.split(",");
        int size=len;
        List<String> list=new ArrayList<String>();
        for(int i=0;i<ss.length;i++){
            list.add(ss[i]);
        }
        for(int i=size;i>0;i--){
            if(len>1){
            if(m==len){
            System.out.println(list.get(len-1));
            list.remove(len-1);
            }else{
            x=m%len-1;
            System.out.println(list.get(x));
            list.remove(x);
            }
            }
            else if(len==1){
                System.out.println(list.get(len-1));
            }
            len--;
        }
}
    public static void test(){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
         String[] sss=s.split(" ");
         int result=getResult(sss);
        if(result!=0){
         System.out.println(result);
        }else{
         System.out.println("对不起,格式错误!");
        }
    }
    public static int getResult(String[] s){
        int result=0;
        if(s.length==3){
        if(s[1].equals("+")||s[1].equals("-")||s[1].equals("*")||s[1].equals("/")){
            String f1=s[0];
            String operate=s[1];
            String f2=s[2];
            switch (operate.charAt(0)){
                case '+':
                    result=tran(f1)+tran(f2);
                    break;
                case '-':
                    result=tran(f1)-tran(f2);
                    break;
                case '*':
                    result=tran(f1)*tran(f2);
                    break;
                case '/':
                    result=tran(f1)/tran(f2);
                    break;
            }
        }else{
          return 0;
        }
        }else{
            return 0;
        }
        return result;
    }
    public static int tran(String s){
        return Integer.parseInt(s);
    }
   public static void main(String[] args){
       Test2 t2=new Test2();
       String s="3,1,2,4,5,6,7,8,9";
      /* t2.getString(s,7,9);*/
       String ss="123 423";
       test();
   }
}
