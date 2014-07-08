package distribute;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-5
 * Time: 下午4:57
 * To change this template use File | Settings | File Templates.
 */
public class ConsistentHash<T> {
    /*
    * 存储服务器信息,key为服务器的hash值,TreeMap根据key进行了排序,便于查找映射节点
    */
    private TreeMap<Long,T>serverNodes=null;

    public ConsistentHash(){
        serverNodes=new TreeMap<Long, T>();
    }
    public ConsistentHash(T[] servers){
        serverNodes=new TreeMap<Long, T>();
        for(T server:servers){
            addServer(server);
        }
    }
    /*
    * 映射服务器到hash环上
    */
     public void addServer(T server){
         serverNodes.put(hash(server), server);
     }
     /*
     * 从hash环上移除服务器
     */
      public void removeServer(T server){
          serverNodes.remove(hash(server));
      }
      /*
      *根据key的hash值的hash环上的映射查找key映射的服务器
      */
    public T getServerNode(Long keyHash){
        if(serverNodes==null){
            return null;
        }
        SortedMap<Long,T> tailMap=serverNodes.tailMap(keyHash);
        if(tailMap.isEmpty()){
            keyHash=serverNodes.firstKey();
        }else{
            keyHash=tailMap.firstKey();
        }
        return serverNodes.get(keyHash);
    }
    /*
    *打印server节点映射顺序
    */
    public void printServerMapOrder(){
        System.out.println(serverNodes);
    }
    /*
    * 计算hash
    */
    public static long hash(Object obj){
       byte[] data=DigestUtils.MD5(obj.toString()).getBytes();
       return data[0]|((long) data[1]<<8|(long)data[2]<<16)|((long)data[3]<<24|((long)data[4]<<32)|((long)data[5]<<40)|((long)data[6]<<48)|((long)data[7]<<56));
    }
    /*
    * byte数组转化为long数组
    */
    public static long byteToLong(byte[] byteArray){
        return Long.parseLong(new String(byteArray));
    }
}
