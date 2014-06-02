package org.java.test.cache;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-10
 * Time: 下午8:14
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    //姓名
    private String username;
     //年龄
    private  int age;
      //体重
    private int weight;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public Person(String username){
        super();
        this.username=username;
    }
}
