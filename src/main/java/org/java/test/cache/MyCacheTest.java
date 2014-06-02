package org.java.test.cache;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-10
 * Time: 下午8:39
 * To change this template use File | Settings | File Templates.
 */
public class MyCacheTest {
    public static void main(String[] args){
        List<Person> list=getUserList("内置1");
        for(Person person:list){
            System.out.println(person.getUsername());
        }
    }
    private static List<Person>getUserList(String roomName){
        Room room=new Room(roomName);
        List<Person> list=MyCache.getPersonByRoomName(room);
        return list;
    }
}
