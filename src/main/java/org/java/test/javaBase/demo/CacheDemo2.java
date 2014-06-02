package org.java.test.javaBase.demo;

import javax.naming.LinkLoopException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-24
 * Time: 下午6:04
 * To change this template use File | Settings | File Templates.
 */
public class CacheDemo2 {
    private Map<Object,Object> pool;
    private LinkedList list;
    private int capacity;
    public CacheDemo2(int size){
        pool=new HashMap<Object, Object>();
        list=new LinkedList();
        this.capacity=size;
    }
    public synchronized Object get(Object key){
        Object value=pool.get(key);
        if(value!=null){
            list.remove(key);
            list.addFirst(key);
        }
        return value;
    }
    public synchronized void put(Object key,Object value){
         Object obj=null;
         if(pool.size()>=capacity){
             obj=list.removeLast();
             pool.remove(obj);
         }
         obj=pool.get(key);
         if(!value.equals(obj)){
             pool.remove(key);
         }
         pool.put(key,value);
         list.remove(key);
         list.addFirst(key);
    }
    public synchronized void clear(){
        list.clear();
        pool.clear();
    }

}
