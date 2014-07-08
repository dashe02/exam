package base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-2
 * Time: 下午10:13
 * To change this template use File | Settings | File Templates.
 */
public class Test1 {
    public void getCount(String s1,int len1,String s2,int len2){
        int count=0;
        if(len1<len2){
            //以len1为准
            for(int i=len1;i>=0;i--){
                for(int j=len2-len1;j>=0;j--){
                    if(s1.charAt(i)==s2.charAt(j)){
                        count++;

                    }
                }
            }
        }else{
            //以len2为准
            for(int i=len2;i>=0;i--){
                for(int j=len1-len2;j>=0;j--){
                    if(s1.charAt(j)==s2.charAt(i)){
                        count++;
                    }
                }
            }
        }
      System.out.println(count);
    }
    public static void main(String[] args){
        Test1 t1=new Test1();
        t1.getCount("2,4,1,7,5",5,"1,3,5",3);
    }
}
