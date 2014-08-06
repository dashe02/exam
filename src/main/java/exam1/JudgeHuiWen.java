package exam1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-4
 * Time: 下午11:55
 * To change this template use File | Settings | File Templates.
 */
public class JudgeHuiWen {
    public static boolean judgeHuiWen(String s){
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<s.length();i++){
           String s1=s.substring(i,i+1);
           sb.append(s1);
         }
         if(sb.reverse().toString().equals(s)){
             return true;
         }else{
             return false;
         }
    }
    public static void main(String[] args){
        String s="12321";
        System.out.println(judgeHuiWen(s));
    }
}
