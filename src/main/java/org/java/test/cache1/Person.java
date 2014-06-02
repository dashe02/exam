package org.java.test.cache1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-10
 * Time: 下午8:56
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String userName;

    private int age;

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Person(String userName){
        super();
        this.userName=userName;
    }
}
