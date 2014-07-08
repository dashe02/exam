package my.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-6
 * Time: 下午12:09
 * To change this template use File | Settings | File Templates.
 */
public class FileClassLoader extends ClassLoader{
       private static final String drive="e:/";
       private static final String fileType=".class";
       public FileClassLoader(){
           super();
       }
       public FileClassLoader(ClassLoader arg0){
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
              fis=new FileInputStream(new File(drive+name+fileType)) ;
               ByteArrayOutputStream baos=new ByteArrayOutputStream();
               int ch=0;
               while((ch=fis.read())!=-1){
                   baos.write(ch);
               }
                data=baos.toByteArray();
           }catch(IOException e){
               e.printStackTrace();
           }
           return data;
       }
      public static void main(String[] args)throws Exception{
          FileClassLoader loader=new FileClassLoader();
          Class objClass=loader.loadClass("HelloWorld",true);
          Object obj=objClass.newInstance();
          System.out.println(objClass.getName());
          System.out.println(objClass.getClassLoader());
      }
}
