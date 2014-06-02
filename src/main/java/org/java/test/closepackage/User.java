package org.java.test.closepackage;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午6:28
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private long id;

    private String name;

    public void setId(long id){
        this.id=id;
    }
    public long getId(){
        return id;
    }
    public void  setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
