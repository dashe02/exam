package org.java.test.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午8:02
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public void connectServer(String ip,int port){
        Socket s=null;
        try{
          s=new Socket(ip,port);
          DataInputStream in=new DataInputStream(s.getInputStream());
          DataOutputStream out=new DataOutputStream(s.getOutputStream());
          System.out.println("服务器发来消息:"+in.readUTF());
          System.out.println("客户端连接成功!");
          s.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
