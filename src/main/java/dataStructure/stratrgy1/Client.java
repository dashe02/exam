package dataStructure.stratrgy1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-6
 * Time: 下午4:51
 * To change this template use File | Settings | File Templates.
 */
public class Client {
      public static void main(String[] args){
          Context context=new Context(new ConcreteStrategy1());
          context.algorithm();
          context=new Context(new ConcreteStrategy2());
          context.algorithm();
      }
}
