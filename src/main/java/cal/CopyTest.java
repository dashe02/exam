package cal;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-12
 * Time: 上午10:20
 * To change this template use File | Settings | File Templates.
 */
public class CopyTest {
    public static void copyTest(String src,String des,int n){
        File srcFile=new File(src);
        File desFile=new File(des);
       try{
        InputStream fs=new FileInputStream(srcFile);
        OutputStream out=new FileOutputStream(desFile);
        byte[] s=new byte[1024];
        while((fs.read(s))!=-1){
            String s1=new String(s);
            out.write(s1.substring(0,n).getBytes("UTF-8"));
        }
        out.close();
        fs.close();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
    public static void main(String[] args){
        String src="E://test.txt";
        String des="F://test.txt";
        int n=5;
        copyTest(src,des,n);
    }
}
