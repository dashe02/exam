package mytreemap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-22
 * Time: 下午7:39
 * To change this template use File | Settings | File Templates.
 */
public class TreeMap<K,V> implements Map<K,V> {

    private Entry<K,V> root;

    private int mapSize;

    private Set<K> keySet=null;

    public TreeMap(){
        root=null;
        mapSize=0;
    }
    @Override
    public int size() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean containsKey(Object key) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean containsValue(Object value) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public V get(Object key) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public V put(K key, V value) {
        Entry<K,V>entry=root,parent=null,newNode;
        int result=0;
        while (entry!=null){
            parent=entry;
            result=((Comparable<K>)entry.getKey()).compareTo(key);
            if(result==0){
                entry.setValue(value);
                return value;
            }else if(result>0){
                entry=entry.getLeft();
            }else{
                entry=entry.getRight();
            }
        }
        newNode =new Entry<K,V>(key,value,parent);
        if(parent==null){
            root=newNode;
        }else if(result>0){
            parent.setLeft(newNode);
        }else{
            parent.setRight(newNode);
        }
        mapSize++;
        return value;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public V remove(Object key) {
        Entry<K,V> entry=getEntry((K) key);
        return remove(entry);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<K> keySet() {
        if(keySet==null){
            keySet=new Set<K>() {
                @Override
                public int size() {
                    return TreeMap.this.size();  //To change body of implemented methods use File | Settings | File Templates.
                }

                @Override
                public boolean isEmpty() {
                    return false;  //To change body of implemented methods use File | Settings | File Templates.
                }

                @Override
                public boolean contains(Object o) {
                    return TreeMap.this.containsKey(o);  //To change body of implemented methods use File | Settings | File Templates.
                }

                @Override
                public Iterator<K> iterator() {
                    return null;  //To change body of implemented methods use File | Settings | File Templates.
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];  //To change body of implemented methods use File | Settings | File Templates.
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;  //To change body of implemented methods use File | Settings | File Templates.
                }

                @Override
                public boolean add(K k) {
                    throw new UnsupportedOperationException("不支持该操作");
                }

                @Override
                public boolean remove(Object o) {
                 throw new UnsupportedOperationException("不支持该操作");
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    for(Iterator iterator=c.iterator();iterator.hasNext();){
                        K key=(K) iterator.next();
                        if(TreeMap.this.containsKey(key)){
                            return true;
                        }
                    }
                    return false;  //To change body of implemented methods use File | Settings | File Templates.
                }

                @Override
                public boolean addAll(Collection<? extends K> c) {
                   throw new UnsupportedOperationException("不支持该操作");
                }

                @Override
                public boolean retainAll(Collection<?> c) {
                     return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    throw new UnsupportedOperationException("不支持该操作");
                }

                @Override
                public void clear() {
                    //To change body of implemented methods use File | Settings | File Templates.
                }
            };
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<V> values() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    private Entry<K,V> getEntry(K key){
       Entry<K,V> entry=root,returnEntry;
       int result=0;
      while (entry!=null){
          result=((Comparable<K>)entry.getKey()).compareTo(key);
          if(result==0){
              return entry;
          }else if(result>0){
              entry=entry.getLeft();
          }else{
              entry=entry.getRight();
          }
      }
        return null;
    }
    private static class Entry<K,V> implements Map.Entry<K, V>{
        private K key;
        private V value;
        private Entry<K,V> left,right,parent;

        public Entry(K key,V value,Entry<K, V> parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            // TODO Auto-generated method stub
            return this.value;
        }

        @Override
        public V setValue(V value) {
            // TODO Auto-generated method stub
            return this.value = value;
        }

        public Entry<K, V> getLeft() {
            return left;
        }

        public void setLeft(Entry<K, V> left) {
            this.left = left;
        }

        public Entry<K, V> getRight() {
            return right;
        }

        public void setRight(Entry<K, V> right) {
            this.right = right;
        }

        public Entry<K, V> getParent() {
            return parent;
        }

        public void setParent(Entry<K, V> parent) {
            this.parent = parent;
        }
    }
}
