package org.java.test.builder3;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午11:21
 * To change this template use File | Settings | File Templates.
 */
public class BenzModel extends CarModel {
   protected void alarm(){
       System.out.println("奔驰车的喇叭声音是这样的...");
   }
   protected void engineBoom(){
       System.out.println("奔驰车的引擎是这个声音的...");
   }
   protected void start(){
       System.out.println("奔驰跑起来这个样子的...");
   }
   protected void stop(){
       System.out.println("奔驰应该这样停车...");
   }
}
