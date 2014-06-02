package org.java.test.builder;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午9:45
 * To change this template use File | Settings | File Templates.
 */
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person PersonBuilder();
}
