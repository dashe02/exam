package algorithm.cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-22
 * Time: 下午3:36
 * To change this template use File | Settings | File Templates.
 */
public class CachePool {
      private Map<Object,Object> pool;
      private LinkedList<Object> list;
      private int capacity;

      public CachePool(int size){
          this.pool=new HashMap<Object, Object>();
          this.list=new LinkedList<Object>();
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
          if(capacity>pool.size()){
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


}
