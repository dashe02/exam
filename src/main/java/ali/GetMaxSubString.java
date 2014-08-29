package ali;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-29
 * Time: 下午8:03
 * To change this template use File | Settings | File Templates.
 */
public class GetMaxSubString {
     public static List<String> getSubString(String s){
             List<String> list=new ArrayList<String>();
             for(int i=1;i<=s.length();i++){
                 for(int j=0;j<s.length()-i;j++){
                     list.add(s.substring(j,j+i));
                 }
             }
           return list;
     }
     public static String getMaxSubString(String s1,String s2){
         List<String> l1=getSubString(s1);
         List<String> l2=getSubString(s2);
         Set<String> s=new HashSet<String>();
         for(int i=0;i<l2.size();i++){
             if(l1.contains(l2.get(i))){
                 s.add(l2.get(i));
             }
         }
         Map<String,Integer> map=new HashMap<String, Integer>();
         Iterator it=s.iterator();
         while(it.hasNext()){
             String ss=(String)it.next();
             map.put(ss,ss.length());

         }
         List<Map.Entry<String,Integer>> infoIds=new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
         Collections.sort(infoIds,new Comparator<Map.Entry<String, Integer>>() {
             @Override
             public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                 return (o1.getValue().toString().compareTo(o2.getValue().toString()));  //To change body of implemented methods use File | Settings | File Templates.
             }
         });
         return infoIds.get(infoIds.size()-1).toString();
     }
     public static void main(String[] args){
         String s1="acbac";
         String s2="acaccbabb";
         System.out.println(getMaxSubString(s1,s2));
     }
}