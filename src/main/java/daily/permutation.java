package daily;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 下午7:57
 * To change this template use File | Settings | File Templates.
 */
public class permutation {
    public static void main(String[] args){
        String str="abcd";
        permutation(str.toCharArray(),0);
    }
    public static void permutation(char[] str,int i){
            if(i>=str.length)
                return;
            if(i==str.length-1){
                System.out.println(String.valueOf(str));
            }else{
                for(int j=i;j<str.length;j++){
                    char temp=str[j];
                    str[j]=str[i];
                    str[i]=temp;
                    permutation(str,i+1);
                    temp=str[j];
                    str[j]=str[i];
                    str[i]=temp;
                }
            }
    }
}
