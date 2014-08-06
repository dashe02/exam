package org.java.test.decorator3;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 上午12:28
 * To change this template use File | Settings | File Templates.
 */
public class Car implements ICar{

    @Override
    public String start() {
         return "runs";
    }
}
