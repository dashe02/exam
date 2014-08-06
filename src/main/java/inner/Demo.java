package inner;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-31
 * Time: 上午9:57
 * To change this template use File | Settings | File Templates.
 */
public class Demo extends Demo3 implements Demo1,Demo2{
    @Override
    public void demo1() {
        System.out.println("demo3->demo1");
    }

    @Override
    public void demo2() {
        System.out.println("demo3->demo2");
    }

    @Override
    public void demo3() {
        super.demo3();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void demo4() {
        super.demo4();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public static void main(String[] args){
        Demo demo=new Demo();
        demo.demo1();
        demo.demo2();
        demo.demo3();
        demo.demo4();
    }
}
