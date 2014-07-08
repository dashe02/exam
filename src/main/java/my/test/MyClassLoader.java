package my.test;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-6
 * Time: 下午12:45
 * To change this template use File | Settings | File Templates.
 */
public class MyClassLoader extends ClassLoader{
     private static String drive="e:/";
     private static String fileType=".class";
     public MyClassLoader(){
         super();
     }
     public MyClassLoader(ClassLoader arg0){
         super(arg0);
     }
     public Class findClass(String name){
         byte[] data=loadClassData(name);
         return defineClass(name,data,0,data.length);
     }
     public byte[] loadClassData(String name){
         FileInputStream fis=null;
         byte[] data=null;
         try{
             fis=new FileInputStream(new File(drive+name+fileType));
             ByteArrayOutputStream baos=new ByteArrayOutputStream();
             int ch=0;
             while((ch=fis.read())!=-1){
                 baos.write(ch);
             }
             data=baos.toByteArray();
         }catch(Exception e){
             e.printStackTrace();
         }
         return data;
     }
    public static void main(String[] args)throws Exception{
        MyClassLoader loader=new MyClassLoader();
        Class obj=loader.loadClass("HelloWorld",true);
        System.out.println(obj.getName());
        System.out.println(obj.getClassLoader());
    }
}
