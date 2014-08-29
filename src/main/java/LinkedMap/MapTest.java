package LinkedMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-22
 * Time: 下午8:20
 * To change this template use File | Settings | File Templates.
 */
public class MapTest {
    public static void main(String[] args){
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(1,59);
        map.put(2,58);
        map.put(7,52);
        map.put(5,54);
        map.put(9,56);
        map.put(3,57);
        Iterator it=map.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
