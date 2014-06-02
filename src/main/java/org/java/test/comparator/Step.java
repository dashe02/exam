package org.java.test.comparator;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-13
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */
public class Step {
    private String acceptTime="";

    private String acceptAddress="";

    public Step(){
        super();
    }
    public Step(String acceptTime,String acceptAddress){
        super();
        this.acceptTime=acceptTime;
        this.acceptAddress=acceptAddress;
    }
    public String getAcceptTime(){
        return acceptTime;
    }
    public void setAcceptTime(String acceptTime){
        this.acceptTime=acceptTime;
    }
    public String getAcceptAddress(){
        return acceptAddress;
    }
     public void setAcceptAddress(String acceptAddress){
         this.acceptAddress=acceptAddress;
     }

}
