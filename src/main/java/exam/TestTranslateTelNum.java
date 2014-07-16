package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-14
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
public class TestTranslateTelNum {

       public static void main(String[] args){
           String strIn="OneTwoDoubleTwo";
           System.out.println(translateTelNum(strIn));
       }
       public static String translateTelNum(String strIn){
          String strTemp=strIn;
          String[] strArr={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Zero","Double"};
          String[] strNum={"1","2","3","4","5","6","7","8","9","0","#"};
          Pattern p=Pattern.compile("//DoubleDouble//d|//p");//若存在双Double/[0-9]/其他字符则直接返回ERROR
          Matcher m=p.matcher(strTemp);
          if(m.find())
          {
              return "ERROR";
          }
          for(int i=0;i<strArr.length;i++){
                strTemp=strTemp.replaceAll(strArr[i],strNum[i]);
          }
          char[] sC=strTemp.toCharArray();
          for(int i=0;i<sC.length;i++){
               if('#'==sC[i]){
                   if(i==sC.length-1)           //如果double处于末尾位置说明也是错误的
                       return "ERROR";
                       sC[i]=sC[i+1];           //将double换成double所修饰的数
               }
          }
            strTemp="";
             for(int i=0;i<sC.length;i++){
                 strTemp+=sC[i];
             }
            p=Pattern.compile("[a-zA-Z]");
            m=p.matcher(strTemp);
            if(m.find()){
                System.out.println(strTemp);
                return "ERROR";
            }
            return strTemp;
       }
}
