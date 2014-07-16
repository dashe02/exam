package daily;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 下午10:01
 * To change this template use File | Settings | File Templates.
 */
public class NumberCount {
    public static void getCount(String[] s,String str){
         int count=0;
         for(int i=0;i<s.length;i++){
                 if(s[i].equals(str)){
                     count++;
                 }
          }
          System.out.println(count);
    }
    public static void main(String[] args){
        String[] s={"1","2","2","2","3"};
        getCount(s,"2");

    }
}
