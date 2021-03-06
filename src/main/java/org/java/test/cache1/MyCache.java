package org.java.test.cache1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-10
 * Time: 下午9:09
 * To change this template use File | Settings | File Templates.
 */
public class MyCache {

    private static final Map<Room,List<Person>> map=new HashMap<Room, List<Person>>();
    static {
        List<Person> list=new ArrayList<Person>();
        Person person=null;
        for(int i=0;i<5;i++){
            person=new Person("user"+i);
            list.add(person);
        }
        map.put(new Room("内置"),list);
    }
       List<Person> list=new ArrayList<Person>();
       private static final Object lock=new Object();
       private MyCache(){

       }
      public static List<Person> getPersonByRoomName(Room room){
          List<Person> list=map.get(room);
          if(list==null){
              synchronized (lock){
                  list=map.get(room);
                  if(list==null){
                      System.out.println("*************");
                      loadDataSource(room);
                  }
                  list=map.get(room);
              }
          }
           return list;
      }
     public static void loadDataSource(Room room){
         List<Person>list=new ArrayList<Person>();
         Person person=null;
         for(int i=0;i<5;i++){
             person=new Person("user"+i);
             list.add(person);
         }
         map.put(room,list);
     }







}
