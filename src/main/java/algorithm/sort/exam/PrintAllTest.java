package algorithm.sort.exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-19
 * Time: 下午7:38
 * To change this template use File | Settings | File Templates.
 */
public class PrintAllTest {
    public static void printAllTest(String s){
        printAllTest(s,"");
    }
    public static void printAllTest(String s,String n){
         if(s.length()==0){
            System.out.println(n);
         }else{
             for(int i=0;i<s.length();++i){
                 printAllTest(s.substring(1),n+s.charAt(0));
                 s=s.substring(1)+s.charAt(0);
             }
         }
    }
    public static void main(String[] args){
        String s="1234";
        printAllTest(s);
    }
}
