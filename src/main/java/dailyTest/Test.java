package dailyTest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 下午8:13
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void test(char[] str,int i){
        if(i>=str.length)
            return;
        if(i==str.length-1){
            System.out.println(String.valueOf(str));
        }else{
            for(int j=i;j<str.length;j++){
                char temp=str[j];
                str[j]=str[i];
                str[i]=temp;
                test(str,i+1);
                temp=str[j];
                str[j]=str[i];
                str[i]=temp;
            }
        }

    }
    public static void main(String[] args){
        String str="abcd";
        test(str.toCharArray(),0);
    }
}
