package algorithm.sort.io;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-18
 * Time: 上午10:41
 * To change this template use File | Settings | File Templates.
 */
public class ITest {
     public static void iTest(String src,String des){
         try{
             File srcFile=new File(src);
             File desFile=new File(des);
             InputStream in=new FileInputStream(srcFile);
             OutputStream out=new FileOutputStream(desFile);
             byte[] c=new byte[1024];
             while(in.read(c,0,200)!=-1){
                 out.write(c);
             }
             out.close();
             in.close();
         }catch(Exception e){
             e.printStackTrace();
         }
     }
    public static void main(String[] args){
        String src="E://test.txt";
        String des="F://test.txt";
        iTest(src,des);
    }
}
