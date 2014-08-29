package map.sort;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-26
 * Time: 上午9:40
 * To change this template use File | Settings | File Templates.
 */
public class MapSort {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("d",2);
        map.put("c",1);
        map.put("b",1);
        map.put("a",3);

        List<Map.Entry<String,Integer>> infoIds=new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        //排序前
        for(int i=0;i<infoIds.size();i++){
            String id=infoIds.get(i).toString();
            //System.out.println(id);
        }
        //排序
        Collections.sort(infoIds,new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue().toString().compareTo(o2.getValue().toString()));  //To change body of implemented methods use File | Settings | File Templates.
            }
        });
      //排序后for(int i=0;i<infoIds.size();i++){
            String id=infoIds.get(infoIds.size()-1).toString();
            System.out.println(id);
    }
}
