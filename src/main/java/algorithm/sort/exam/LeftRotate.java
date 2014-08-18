package algorithm.sort.exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午8:10
 * To change this template use File | Settings | File Templates.
 */
public class LeftRotate {
    public static String LeftRotate(String s,int n){
        StringBuilder sb=new StringBuilder();
        for(int i=n;i<s.length();i++){
            sb.append(s.substring(i,i+1));
        }
        for(int i=0;i<n;i++){
            sb.append(s.substring(i,i+1));
        }
        return  sb.toString();
    }
    public static void main(String[] args){
        System.out.println(LeftRotate("abcdef",2));
    }
}
