package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午2:59
 * To change this template use File | Settings | File Templates.
 */
public class GetHanZi {
   //已知一个字串由GBK汉字和ansi编码的数字字母混合组成,去掉所有ansi编码的字母和数字(包括大小写),要求在原字符串上
   // 返回
    public static boolean isChinese(char c) throws Exception{
        return String.valueOf(c).getBytes("GBK").length>1;
    }
    public static String filterString(String s) throws Exception{
        StringBuffer buffer=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isChinese(c)){
              buffer.append(c);
            }
        }
        return buffer.toString();
    }
    public static void main(String[] args){
        String s="我grf是中国人";
        try{
            System.out.println(filterString(s));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
