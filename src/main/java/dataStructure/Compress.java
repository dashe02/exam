package dataStructure;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 上午10:50
 * To change this template use File | Settings | File Templates.
 */
public class Compress {
    public static String Compress(String s){
        String [] ss=s.split(" ");
        StringBuilder sb=null;
        for(int i=0;i<ss.length;i++){
            sb=new StringBuilder();
            for(int j=0;j<ss[i].length();j++){
                StringBuilder ssb=new StringBuilder();
                ssb.append(ss[j]);
                sb.append(ssb.reverse().toString()+" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s="abc efg hij";
        System.out.println(Compress(s));
    }
}
