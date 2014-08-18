package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午2:26
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static boolean isChinese(char c) throws Exception{
        return String.valueOf(c).getBytes("UTF-8").length>1;
    }
    public static String filterString(String orginal,int count) throws Exception{
        if(orginal!=null&&!"".equals(orginal)){
            orginal=new String(orginal.getBytes(),"UTF-8");
            if(count>0&&count<orginal.getBytes("UTF-8").length){
                StringBuffer buffer=new StringBuffer();
                char c;
                for(int i=0;i<count-1;i++){
                    c= orginal.charAt(i);
                     buffer.append(c);
                    if(isChinese(c)){
                        --count;
                    }
                }
                return  buffer.toString();
            }
        }
        return orginal;
    }
    public static void main(String[] args){
        String s="我grf是Chinese";
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
