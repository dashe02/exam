package regex;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-4
 * Time: 上午9:51
 * To change this template use File | Settings | File Templates.
 */
public class StringTest2 {
    public static void main(String[] args){
        String str="2006-04-15 02:31:04";
        String str1="";
        String[] result=str.split("//D");
        for(int i=0;i<result.length;i++){
            str1+=result[i];
        }
        System.out.println(str1);
    }
}
