package distribute;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-5
 * Time: 下午6:20
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        String[] servers=new String[]{"Server 1:192.168.1.1","Server 2:192.168.1.2","Server 3:192.168.1.3","Server 4:192.168.1.4","Server 5:192.168.1.5"};
        ConsistentHash<String> consHash=new ConsistentHash<String>(servers);
        System.out.println("服务器映射信息:");
        consHash.printServerMapOrder();
        System.out.println("数据映射信息:");
        showDataMap(consHash);
        //移除server2
        consHash.removeServer(servers[2]);
        System.out.println("移动server 3后数据映射信息:");
        showDataMap(consHash);
    }
    public static void showDataMap(ConsistentHash<String> consHash){
        for(int i=0;i<5;i++){
            System.out.println("Data"+i+" mapped at "+consHash.getServerNode(ConsistentHash.hash("Data"+i)));
        }
    }
}
