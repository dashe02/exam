package cache;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-2
 * Time: 下午2:42
 * To change this template use File | Settings | File Templates.
 */
public interface Cache {
    public String getId();

    public int getSize();

    public void putObject(Object paramObject1,Object paramObject2);

    public Object getObject(Object paramObject);

    public Object removeObject(Object paramObject);

    public void clear();

    public ReadWriteLock getReadWriteLock();











}
