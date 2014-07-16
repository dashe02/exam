package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-14
 * Time: 下午4:53
 * To change this template use File | Settings | File Templates.
 */
public class Transfer {
    public static void main(String[] args){
        String strIn="OneTwoDoubleTwo";
        System.out.println(transfer(strIn));
    }
    public static String transfer(String strIn){
        String strTemp=strIn;
        String[] strArr={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Zero","Double"};
        String[] strNum={"1","2","3","4","5","6","7","8","9","0","#"};
        Pattern p=Pattern.compile("//DoubleDouble|//d|//p");
        Matcher m=p.matcher(strIn);
        while (m.find()){
            return "Error";
        }
        for(int i=0;i<strArr.length;i++){
           strTemp=strTemp.replaceAll(strArr[i],strNum[i]);
        }
        char[] sC=strTemp.toCharArray();
        for(int i=0;i<sC.length;i++){
            if('#'==sC[i]){
                if(i==sC.length-1)
                    return "Error";
                sC[i]=sC[i+1];
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
            return "Error";
        }
        return strTemp;
    }
}
