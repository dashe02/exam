package my.test;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.FileInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-31
 * Time: 上午10:59
 * To change this template use File | Settings | File Templates.
 */
public class ClassLoaderDemo extends ClassLoader{
   /* private static final String drive="e:/classLoader/";*/
    private static final String drive="F:/Program Files(x86)/Java/jdk1.6.0_43/lib/";
    private static final String fileType=".class";

    public ClassLoaderDemo(){
        super();
    }

    public ClassLoaderDemo(ClassLoader arg0){
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
          fis=new FileInputStream(drive+name+fileType);
          ByteOutputStream baos=new ByteOutputStream();
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
    public static void main(String[] args) throws Exception{
        ClassLoaderDemo classLoaderDemo=new ClassLoaderDemo();
        Class cl=classLoaderDemo.loadClass("HelloWorld",true);
        System.out.println(cl);
        System.out.println(cl.getName());
        System.out.println(cl.getClassLoader());
    }
}
