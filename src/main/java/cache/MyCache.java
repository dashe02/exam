package cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-2
 * Time: 下午2:40
 * To change this template use File | Settings | File Templates.
 * 使用hashMap实现cache
 */
public class MyCache implements Cache{

    private String id;

    private Map<Object,Object> cache=new HashMap<Object, Object>();

    private ReadWriteLock readWriteLock=new ReentrantReadWriteLock();

    public MyCache(String id){
        this.id=id;
    }

    @Override
    public String getId() {
        return this.id;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getSize() {
        return this.cache.size();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void putObject(Object key, Object value) {
         this.cache.put(key,value);
    }

    @Override
    public Object getObject(Object key) {
        return this.cache.get(key);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object removeObject(Object key) {
        return this.cache.remove(key);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
      this.cache.clear();
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return this.readWriteLock;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean equals(Object o){
        if(getId()==null) return false;
        if(this==o) return true;
        if(!(o instanceof Cache)) return false;
        Cache otherCache=(Cache)o;
        return getId().equals(otherCache.getId());
    }

       public int hashCode(){
          if(getId()==null) return 0;
          return getId().hashCode();
       }
}
