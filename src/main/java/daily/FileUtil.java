package daily;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-8
 * Time: 下午10:12
 * To change this template use File | Settings | File Templates.
 */
public class FileUtil {
    public static void fileUtil(String src,String dest,int n){
        File srcFile=new File(src);
        File desFile=new File(dest);
        try{
        FileReader fr=new FileReader(srcFile);
        FileWriter fw=new FileWriter(desFile);
        char[]  b=new char[1024];
        while(fr.read(b)!=-1){
            String str=String.valueOf(b);
            char[] c=str.substring(0,n).toCharArray();
            fw.write(c);
        }
            fw.close();
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        String f1="E://test1.txt";
        String f2="E://test2.txt";
        fileUtil(f1,f2,2);
    }
}
