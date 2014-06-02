package org.java.test.builder3;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午11:12
 * To change this template use File | Settings | File Templates.
 */
public abstract class CarModel {
    private ArrayList<String> sequence=new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected  abstract void engineBoom();

    final public void run(){
        for(int i=0;i<this.sequence.size();i++)
        {
            String actionName=this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            }else if(actionName.equalsIgnoreCase("stop")){
                this.stop();
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(actionName.equalsIgnoreCase("engineBoom")){
                this.engineBoom();
            }
        }
    }
    final public void setSequence(ArrayList<String> sequence){
        this.sequence=sequence;
    }
}
