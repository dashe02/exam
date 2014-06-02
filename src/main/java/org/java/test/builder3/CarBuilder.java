package org.java.test.builder3;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午11:31
 * To change this template use File | Settings | File Templates.
 */
public abstract class CarBuilder {
       public abstract void setSequence(ArrayList<String> sequence);

       public abstract CarModel getCarModel();
}
