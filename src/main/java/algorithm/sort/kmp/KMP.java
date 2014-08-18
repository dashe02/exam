package algorithm.sort.kmp;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午8:37
 * To change this template use File | Settings | File Templates.
 */
public class KMP {
    public static int[] next(char[] t) {
        int[] next=new int[t.length];
        next[0]=-1;
        int i=0;
        int j=-1;
        while(i<t.length-1){
            if(j==-1||t[i]==t[j]){
                i++;
                j++;
                if(t[i]!=t[j]){
                    next[i]=j;
                }else{
                    next[i]=next[j];
                }
            }else {
                j=next[j];
            }
        }
        return next;
    }
    public static int KMP_Index(char[] s,char[] t){
        int[] next=next(t);
        int i=0;
        int j=0;
        while(i<=s.length-1&&j<=t.length-1){
            if(j==-1||s[i]==t[j]){
                i++;
                j++;
            }else {
                j=next[j];
            }
        }
        if(j<t.length){
            return -1;
        }else{
            return i-t.length;
        }
    }
   public static void main(String[] args){
       String s = "abbabbbbcab"; // 主串
       String t = "bbcab"; // 模式串
       char[] ss=s.toCharArray();
       char [] tt=t.toCharArray();
       System.out.println(KMP_Index(ss,tt));
       System.out.println(s.substring(KMP_Index(ss,tt),s.length()));
   }
}
