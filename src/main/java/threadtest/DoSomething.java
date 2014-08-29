package threadtest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午3:57
 * To change this template use File | Settings | File Templates.
 */
public class DoSomething implements Runnable{

       private String name;

       public DoSomething(String name){
           this.name=name;
       }

       public void run(){
           for(int i=0;i<10;i++){
               System.out.println(name+""+i);
           }
       }
}
