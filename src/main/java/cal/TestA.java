package cal;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-10
 * Time: 下午7:20
 * To change this template use File | Settings | File Templates.
 */
class B{
    static {
        System.out.println("Load B");
    }
    public B(){
        System.out.println("Create B");
    }
}
class A extends B{
    static {
        System.out.println("Load A");
    }
    public A(){
        System.out.println("Create A");
    }
}
public class TestA {
   public static void main(String[] args){
       new A();
   }
}
