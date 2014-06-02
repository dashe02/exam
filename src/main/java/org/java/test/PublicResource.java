package org.java.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午5:26
 * To change this template use File | Settings | File Templates.
 */
public class PublicResource {
         private int counter=0;

        public PublicResource(){

        }
        public synchronized void add(){
            while(counter>0){
                 try{
                     wait();
                 }catch (Exception e){
                     e.printStackTrace();
                 }
                  counter++;
                  System.out.print(counter);
                  notify();
            }
        }
        public synchronized void minus(){
                while(counter==0){
                    try{
                        wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    counter--;
                    System.out.print(counter);
                    notify();
                }
        }
}
