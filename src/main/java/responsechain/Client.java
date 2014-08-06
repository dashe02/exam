package responsechain;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 下午2:58
 * To change this template use File | Settings | File Templates.
 */
public class Client {
   public static void main(String[] args){
       Handler handler1=new ConcreteHandler();
       Handler handler2=new ConcreteHandler();
       handler1.setSuccessor(handler2);
       handler1.handlerRequest();
   }
}
