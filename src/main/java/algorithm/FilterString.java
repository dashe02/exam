package algorithm;

import java.io.UnsupportedEncodingException;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 上午10:55
 * To change this template use File | Settings | File Templates.
 */
public class FilterString {
    public static boolean isChineseChar(char c) throws UnsupportedEncodingException{
        return String.valueOf(c).getBytes("UTF-8") .length>1;
    }
    public static String filterString(String orignal,int count) throws UnsupportedEncodingException{
         if(orignal!=null&&!"".equals(orignal)){
             orignal=new String(orignal.getBytes(),"UTF-8");
             if(count>0&&count<orignal.getBytes("UTF-8").length){
                 StringBuffer buff=new StringBuffer();
                 char c;
                 for(int i=0;i<count-1;i++){
                     c=orignal.charAt(i);
                     buff.append(c);
                     if(isChineseChar(c)){
                         --count;
                     }
                 }
                 return buff.toString();
             }
         }
        return orignal;
    }
    public static void main(String[] args){
        String s="我gfr是Chinese";
        try{
            System.out.println(filterString(s,1));
            System.out.println(filterString(s,2));
            System.out.println(filterString(s,6));
            System.out.println(filterString(s,7));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
