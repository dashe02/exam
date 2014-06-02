package org.java.test.cache;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-10
 * Time: 下午8:16
 * To change this template use File | Settings | File Templates.
 */
public class Room {
    //房间名称
    private String roomName;
    //房间面积
    private int area;
    //房间价格
    private BigDecimal price;
    //酒店的地址
    private String address;
    //酒店的电话
    private String phoneNumber;

    private List<Person> persons;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    public Room(String roomName){
        super();
        this.roomName=roomName;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Room)){
            return false;
        }
        Room r1=(Room)obj;
        return r1.getRoomName().equals(this.getRoomName());
    }
    public int hashCode(){
        return roomName.hashCode();
    }

}
