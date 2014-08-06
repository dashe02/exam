package regex;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-4
 * Time: 上午9:38
 * To change this template use File | Settings | File Templates.
 */
public class GetNumber {
    static String s="32fdsfd8fds0fdsf9323k32k";

    public static void main(String[] args){
        String a=s.replaceAll("[^0-9]","");
        System.out.println(a);
    }
}
