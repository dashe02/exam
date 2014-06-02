package org.java.test.flyweight;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 下午7:09
 * To change this template use File | Settings | File Templates.
 */
public class FlyweightFactory {
    private Hashtable flyweights=new Hashtable();
    public FlyweightFactory(){

    }
    public  FlyWeight getFlyWeight(Object obj){
        FlyWeight flyweight=(FlyWeight)flyweights.get(obj);
        if(flyweight==null){
            flyweight=new ConcreteFlyweight((String)obj);
            flyweights.put(obj,flyweight);
        }
        return flyweight;
    }
    public int getFlyweightSize(){
        return flyweights.size();
    }
}
