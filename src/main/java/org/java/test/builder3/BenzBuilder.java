package org.java.test.builder3;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午11:33
 * To change this template use File | Settings | File Templates.
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz=new BenzModel();

    public CarModel getCarModel(){
        return this.benz;
    }

    public void setSequence(ArrayList<String> seqence)
    {
        this.benz.setSequence(seqence);
    }
}
