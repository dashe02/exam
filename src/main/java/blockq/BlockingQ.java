package blockq;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午10:44
 * To change this template use File | Settings | File Templates.
 */
public class BlockingQ {
    private Object notEmpty=new Object();
    private Object notFull=new Object();
    private Queue<Object> linkedList=new LinkedList<Object>();
    private int maxLength=10;

    public Object take() throws InterruptedException{
        synchronized (notEmpty){
            if(linkedList.size()==0){
                notEmpty.wait();
            }
            synchronized (notFull){
                if(linkedList.size()==maxLength){
                    notFull.notifyAll();
                }
                return linkedList.poll();
            }
        }
    }
    public Object offer(Object object) throws InterruptedException{
             synchronized (notEmpty){
                 if(linkedList.size()==0){
                     notEmpty.notifyAll();
                 }
                 synchronized (notFull){
                     if(linkedList.size()==maxLength){
                         notFull.wait();
                     }
                     return linkedList.add(object);
                 }
             }
    }
}
/*
* 用两个锁,分别在链表为空或者为满的时候同步
*
*
*/
