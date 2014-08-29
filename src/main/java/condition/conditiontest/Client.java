package condition.conditiontest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午4:56
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args){
        MyCount myCount=new MyCount("95599200901215522",10000);
        ExecutorService pool=Executors.newFixedThreadPool(2);
        Thread t1=new SaveThread(myCount,"张三",2000);
        Thread t2=new SaveThread(myCount,"李四",3600);
        Thread t3=new DrawThread(myCount,"王五",900);
        Thread t4=new SaveThread(myCount,"老张",1000);
        Thread t5=new DrawThread(myCount,"老牛",1300);
        Thread t6=new SaveThread(myCount,"胖子",800);
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        pool.execute(t6);
        pool.shutdown();
    }
}
