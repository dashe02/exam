package valtaile;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-21
 * Time: 下午8:33
 * To change this template use File | Settings | File Templates.
 */
public class VolatileTest {
    private static int number;
    private static volatile boolean ready;

    private static class ReadThread extends Thread{
        public void run(){
            while (!ready){
                Thread.yield();
                System.out.println(number);
            }
        }
        public static void main(String[] args){
            new ReadThread().start();
            number=42;
            ready=true;
        }
    }
}
