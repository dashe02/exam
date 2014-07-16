package daily;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 下午7:24
 * To change this template use File | Settings | File Templates.
 */
public class ValidateIsNumber {
    //检查字符是否是整数,若是，则返回整数值.
    public static void validateIsNumber(String s){
        int count=0;
        if(s.charAt(0)=='-'){
            count++;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    count++;
                }
            }
        }else{
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                   count++;
            }
        }
        }
        if(count==s.length()){
            System.out.println(s);
        }else{
            System.out.println("此为非整数字符串");
        }
    }
    public static void main(String[] args){
        String s="10100s0";
        validateIsNumber(s);
    }
}
