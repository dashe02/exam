package algorithm.sort.nio;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-19
 * Time: 上午12:33
 * To change this template use File | Settings | File Templates.
 */
public class TestClient {
     public static void main(String[] args) throws Exception{
         Socket s=new Socket("127.0.0.1",8888);
         InputStream inputStream=s.getInputStream();
         OutputStream outputStream=s.getOutputStream();
         //输出
         PrintWriter out=new PrintWriter(outputStream,true);
         out.println("getPublicKey你好!");
         out.flush();
         s.shutdownOutput(); //输出结束
         //输入
         Scanner in=new Scanner(inputStream);
         StringBuilder sb=new StringBuilder();
         while(in.hasNextLine()){
             String line=in.nextLine();
             sb.append(line);
         }
         String response=sb.toString();
         System.out.println("response="+response);




















     }
}
