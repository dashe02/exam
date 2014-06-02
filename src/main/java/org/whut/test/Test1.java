package org.whut.test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-17
 * Time: 下午8:12
 * To change this template use File | Settings | File Templates.
 */
class ReadFile{
    private String readFile1;
    private String readFile2;
    private String outFile;
    public ReadFile(String readFile1,String readFile2,String outFile){
        this.readFile1=readFile1;
        this.readFile2=readFile2;
        this.outFile=outFile;
    }
    public void readFile(String inPath,String outPath){
        File file=new File(inPath);
        try{
            InputStream in=new FileInputStream(file);
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
    public  void readFile1(){
        readFile(readFile1,outFile);
    }
    public  void readFile2(){
        readFile(readFile2,outFile);
    }
}
class ReadFile1 extends Thread{
    private ReadFile readFile;
    int i;
    public ReadFile1(ReadFile readFile){
        this.readFile=readFile;
    }
    public synchronized void run(){
        if(i%2==0){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        i++;
        readFile.readFile1();
        notify();
    }
}
class ReadFile2 extends Thread{
    private ReadFile readFile;
    int i;
    public ReadFile2(ReadFile readFile){
        this.readFile=readFile;
    }
    public synchronized void run(){
        if(i%2!=0){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        i++;
        readFile.readFile2();
        notify();
    }
}
public class Test1{
        private static String readPath1="F://read/a.txt";
        private static String readPath2="F://read/b.txt";
        private static String readPath3="F://read/c.txt";
        public static void main(String[] args){
        ReadFile readFile=new ReadFile(readPath1,readPath2,readPath3);
        ReadFile1 readFile1=new ReadFile1(readFile);
        ReadFile2 readFile2=new ReadFile2(readFile);
        readFile1.start();
        readFile2.start();
    }
}
