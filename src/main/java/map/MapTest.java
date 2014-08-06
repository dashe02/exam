package map;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-3
 * Time: 上午8:08
 * To change this template use File | Settings | File Templates.
 */
public class MapTest {
    public static void main(String[] args){
        List<Integer> map=new ArrayList<Integer>();
        map.add(1);
        map.add(1);
        Iterator m=map.iterator();
        while (m.hasNext()){
             System.out.println(m.next());
        }
    }
}
