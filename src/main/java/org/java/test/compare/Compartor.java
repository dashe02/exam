package org.java.test.compare;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午7:46
 * To change this template use File | Settings | File Templates.
 */
public class Compartor {
    public void test(){
    String[] input={"bed","dog","dear","eye"};
    for(int i=0;i<input.length-1;i++){
        for(int j=0;j<input.length-i-1;j++){
             if(compare(input[j],input[j+1])){
                 String temp=input[j];
                 input[j]=input[j+1];
                 input[j+1]=temp;
             }
        }
        for(String str:input){
            System.out.println(str);
        }
    }
    }
    public boolean compare(String a,String b){
            int len1=a.length();
            int len2=b.length();
            boolean flag=false;
            for(int i=0;i<(len1<len2?len1:len2);i++){
               if(toPriority(a.charAt(i))<toPriority(b.charAt(i))){
                   flag=false;
                   break;
               }else if(toPriority(a.charAt(i))>toPriority(b.charAt(i))){
                   break;
               }else{
                   continue;
               }
            }
            return flag;
    }
    public int  toPriority(char c){
         switch(c){
             case 'd':return 8;
             case 'g':return 7;
             case 'e':return 6;
             case 'c':return 5;
             case 'f':return 4;
             case 'b':return 3;
             case 'o':return 2;
             case 'a':return 1;
             default:return 0;
         }
    }
    public static void main(String[] args){
        Compartor compartor=new Compartor();
        compartor.test();
    }
}
