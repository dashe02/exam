package org.java.test.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午8:01
 * To change this template use File | Settings | File Templates.
 */
public class Server {
    public void connectClient(int port){
        ServerSocket ss=null;
        try{
          ss=new ServerSocket(port);
          Socket s=ss.accept();
          DataInputStream in=new DataInputStream(s.getInputStream());
          DataOutputStream out=new DataOutputStream(s.getOutputStream());
          System.out.println("客户端发来的消息:" + in.readUTF());
          out.writeUTF("服务器端连接成功!");
          s.close();
          ss.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Server server=new Server();
        server.connectClient(8888);
    }
}
