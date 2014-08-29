package cas;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 上午11:08
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        NonBlockingCounter nonBlockingCounter=new NonBlockingCounter();
        System.out.println(nonBlockingCounter.increment());
    }
}
