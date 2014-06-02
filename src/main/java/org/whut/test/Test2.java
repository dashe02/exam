package org.whut.test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-17
 * Time: 下午9:22
 * To change this template use File | Settings | File Templates.
 */
public class Test2 {
    public void readFile(File inPath,File outPath){
        try{
            InputStream in=new FileInputStream(inPath);
            OutputStream out=new FileOutputStream(outPath);
            int b;
            while((b=in.read())!=-1){
                out.write(b);
            }
            out.close();
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void read(){
        File file=new File("F://java");
        String dir="F://jad";
        if(file.isDirectory()){
            File[] files=file.listFiles();
            for(int i=0;i<files.length;i++){
               File file1=new File(files[i].getPath());
              // System.out.println(files[i].getName());
               int j=files[i].getName().indexOf(".");
               String[] fileName=new String[files.length];
               fileName[i]=files[i].getName().substring(0,j);
                //System.out.println(fileName[i]);
                File file2=new File(dir+"//"+fileName[i]+".jad");
                readFile(file1,file2);
            }
        }
    }
    public static void main(String[] args){
        Test2 test2=new Test2();
        test2.read();
    }
}
