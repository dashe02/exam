package base;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午8:28
 * To change this template use File | Settings | File Templates.
 */
public class StringCompress {
    public static final byte[] compress(String paramString){
        if(paramString==null)
            return null;
        ByteArrayOutputStream byteArrayOutputStream=null;
        ZipOutputStream zipOutputStream=null;
        byte[] arrayOfByte;
        try{
            byteArrayOutputStream=new ByteArrayOutputStream();
            zipOutputStream=new ZipOutputStream(byteArrayOutputStream);
            zipOutputStream.putNextEntry(new ZipEntry("0"));
            zipOutputStream.write(paramString.getBytes());
            zipOutputStream.closeEntry();
            arrayOfByte=byteArrayOutputStream.toByteArray();
        }catch(IOException localIOException){
          arrayOfByte=null;
        }finally {
            if(zipOutputStream!=null)
                try{
                    zipOutputStream.close();
                }catch(IOException localIOException){

                }
            if(byteArrayOutputStream!=null){
                try{
                    byteArrayOutputStream.close();
                }catch(IOException localIOException){

                }
            }
        }
        return arrayOfByte;
    }






}
