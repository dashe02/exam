package exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-26
 * Time: 下午10:34
 * To change this template use File | Settings | File Templates.
 */
abstract class C{
    public void test(){
     System.out.println("C");
    }
}
abstract class D extends C{
    @Override
    public void test() {
        super.test();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
public  class AbstractClassTest {



}
