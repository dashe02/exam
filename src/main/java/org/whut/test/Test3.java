package org.whut.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-17
 * Time: 下午9:45
 * To change this template use File | Settings | File Templates.
 */
public class Test3 {
    public void count(String str){
        int engCount=0;
        int chinaCount=0;
        int numberCount=0;
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)>'0'&&str.charAt(i)<'9'){
               numberCount++;
           }else if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z'){
               engCount++;
           }else{
               chinaCount++;
           }
        }
        System.out.println("数字有:"+numberCount+",英文有:"+engCount+",中文有:"+chinaCount);
    }
    public static void main(String[] args){
        Test3 test3=new Test3();
        String str="中国aadf的111萨bbb菲的zz萨菲";
        test3.count(str);
    }


}
