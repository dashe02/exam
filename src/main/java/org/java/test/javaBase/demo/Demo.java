package org.java.test.javaBase.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-24
 * Time: 下午6:46
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public String getString(String str){
        StringBuilder sb=new StringBuilder();
        sb.append("(");
        for(int i=1;i<str.length()-1;i++){
            char c=str.charAt(i);
            if(c!=40&&c!=41){
                sb.append(c);
            }
        }
        sb.append(")");
        return sb.toString();
    }
    public void checkString(String str){
          for(int i=1;i<str.length()-1;i++){
              if(str.charAt(i)==40||str.charAt(i)==41)
                  throw new MyException();
          }
    }
    public static void main(String[] args){
        Demo demo=new Demo();
        String str="(1,(2,3),(4,(5,6),7))";
        demo.checkString(demo.getString(str));
        System.out.println(demo.getString(str));
    }

}
