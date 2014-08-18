package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午11:29
 * To change this template use File | Settings | File Templates.
 */
public class GetCount {
    //给定字符串中只有"R","G","B"三个字符,请排序,最终结果的顺序是R在前G在中B在后
    public static void getCount(String s){
           StringBuilder sb=new StringBuilder();
           for(int i=1;i<s.length();i++){
               String s1=s.substring(i-1,i);
               String s2=s.substring(i,i+1);
               if(s1.compareTo(s2)<0){
                   swap(s1,s2);
               }
               sb.append(s1).append(s2);
           }
          System.out.println(sb.toString());
    }
    public static void swap(String s1,String s2){
        String temp=s1;
        s1=s2;
        s2=temp;
    }
    public static void main(String[] args){
        String s="RGBBGRRRG";
        getCount(s);
        System.out.println(s);
    }
}
