package org.java.test.cache1;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-10
 * Time: 下午9:21
 * To change this template use File | Settings | File Templates.
 */
public class MyCacheTest {
    public static void main(String[] args){
        List<Person> list=getUserList(new Room("内置"));
        for(Person person:list){
            System.out.println(person.getUserName());
        }
    }
    public static List<Person> getUserList(Room room){
        List<Person> list=MyCache.getPersonByRoomName(room);
        return list;
    }
}
