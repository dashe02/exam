package org.java.demo;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 下午9:55
 * To change this template use File | Settings | File Templates.
 */
public class FlyWeightFactory {
    private Hashtable flyweights=new Hashtable();

    public FlyWeightFactory(){

    }
    public FlyWeight getFlyWeight(Object obj){
        FlyWeight flyWeight=(FlyWeight)flyweights.get(obj);
        if(flyWeight==null){
            flyWeight=new ConcreteFlyWeight((String)obj);
            flyweights.put(obj,flyWeight);
        }
        return flyWeight;
    }
    public int getFlyWeightSize(){
        return flyweights.size();
    }
}
