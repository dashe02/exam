package org.java.test.builder3;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午11:35
 * To change this template use File | Settings | File Templates.
 */
public class BMWBuilder extends CarBuilder{
    private BMWModel bmw=new BMWModel();

    public CarModel getCarModel(){
        return this.bmw;
    }
    public void setSequence(ArrayList<String> sequence){
        this.bmw.setSequence(sequence);
    }

}
