package base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午8:44
 * To change this template use File | Settings | File Templates.
 */
public class Test16 {
    public static void transfer(String s){
         String ss="";
         for(int i=0;i<s.length();i++){
             char c=tr(s.charAt(i));
              ss+=s.charAt(i)+"->"+c+",";
             for(int j=1;j<s.length();j++){
                 if(s.charAt(i)==s.charAt(j)){

                 }
             }
         }
        System.out.println(ss);
    }
    public static char tr(char c){
        return (char)(c+1);
    }
    public static void main(String[] args){
        String s="abcdefg";
        transfer(s);
    }
}
