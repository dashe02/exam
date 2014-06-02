package org.java.test.socket;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午8:14
 * To change this template use File | Settings | File Templates.
 */
public class ConnectTest {
    public static void main(String[] args){
          Client client=new Client();
          client.connectServer("127.0.0.1",8888);
    }
}
