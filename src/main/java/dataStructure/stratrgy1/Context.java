package dataStructure.stratrgy1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-6
 * Time: 下午4:49
 * To change this template use File | Settings | File Templates.
 */
public class Context {
    private AbstractStrategy strategy;

    public Context(AbstractStrategy strategy){
        this.strategy=strategy;
    }
    public void algorithm(){
        this.strategy.algorithm();
    }
}
