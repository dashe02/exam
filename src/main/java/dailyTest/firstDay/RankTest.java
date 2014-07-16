package dailyTest.firstDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 下午8:22
 * To change this template use File | Settings | File Templates.
 */
public class RankTest {
    public static void main(String[] args){
        String str="abcd";
        rankTest(str.toCharArray(),0);
    }
    public static void rankTest(char[] str,int i){
         if(i>str.length)
             return;
         if(i==str.length)
         {
             System.out.println(String.valueOf(str));
         }else{
             for(int j=i;j<str.length;j++){
                 char temp=str[j];
                 str[j]=str[i];
                 str[i]=temp;
                 rankTest(str,i+1);
                 temp=str[j];
                 str[j]=str[i];
                 str[i]=temp;
             }
         }
    }
}
