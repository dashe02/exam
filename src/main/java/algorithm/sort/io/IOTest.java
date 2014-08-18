package algorithm.sort.io;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-16
 * Time: 上午10:55
 * To change this template use File | Settings | File Templates.
 */
public class IOTest {

       public static void copyFile(String src,String des){
           File srcFile=new File(src);
           File desFile=new File(des);
           try{
               InputStream in=new FileInputStream(srcFile);
               OutputStream out=new FileOutputStream(desFile);
               int b=0;
               while((b=in.read())!=-1){
                   out.write(b);
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
        copyFile(src,des);
    }
}
