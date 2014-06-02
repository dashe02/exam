package org.java.test.builder3;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午11:38
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args){
        ArrayList<String> sequence=new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        BenzBuilder benzBuilder=new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz=(BenzModel)benzBuilder.getCarModel();
        benz.run();
    }
}
