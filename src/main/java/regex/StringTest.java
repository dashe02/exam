package regex;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-4
 * Time: 上午9:44
 * To change this template use File | Settings | File Templates.
 */
public class StringTest {
    public static void main(String[] args){
        String s="2006-04-15 02:31:04";
        s=s.replaceAll("-","");
        s=s.replaceAll(":","");
        s=s.replaceAll(" ","");
        System.out.println(s);
    }
}
