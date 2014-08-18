package algorithm.sort.string;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-18
 * Time: 下午2:20
 * To change this template use File | Settings | File Templates.
 */
public class MyString {
    public static int compareTo(String str1, String str2){
           int n1=str1.length();
           int n2=str2.length();
           for(int i1=0,i2=0;i1<n1&&i2<n2;i1++,i2++){
                 char  c1=str1.charAt(i1);
                 char c2=str2.charAt(i2);
                 if(c1!=c2){
                     c1=Character.toUpperCase(c1);
                     c2=Character.toUpperCase(c2);
                     if(c1!=c2){
                         c1=Character.toLowerCase(c1);
                         c2=Character.toLowerCase(c2);
                         if(c1!=c2){
                             return c1-c2;
                         }
                     }
                 }
           }
        return n1-n2;
    }
    public static void main(String[] args){
        String str1="abcd";
        String str2="abcd4";
        System.out.println(compareTo(str1,str2));
    }
}
