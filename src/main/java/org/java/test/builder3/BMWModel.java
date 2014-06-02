package org.java.test.builder3;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午11:25
 * To change this template use File | Settings | File Templates.
 */
public class BMWModel extends CarModel {

    protected void alarm(){
        System.out.println("宝马车的喇叭声音是这样的...");
    }
    protected void engineBoom(){
       System.out.println("宝马车的引擎是这样的...");
   }
    protected void start(){
        System.out.println("宝马车跑起来是这样的...");
    }
    protected void stop(){
        System.out.println("宝马车应该这样停车...");
    }
}

