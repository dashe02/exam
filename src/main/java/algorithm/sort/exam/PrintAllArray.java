package algorithm.sort.exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-19
 * Time: 下午7:31
 * To change this template use File | Settings | File Templates.
 */
public class PrintAllArray {
    public static void printAllArray(String s){
        printAllArray(s,"");
    }
    public static void printAllArray(String s,String n){
        if(s.length()==0){
            System.out.println(n);
        }else {
            for(int i=0;i<s.length();i++){
                printAllArray(s.substring(1),n+s.charAt(0));
                s=s.substring(1)+s.charAt(0);
            }
        }
    }
    public static void main(String[] args){
        String s="1234";
        printAllArray(s);
    }
}
