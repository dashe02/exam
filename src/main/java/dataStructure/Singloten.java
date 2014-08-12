package dataStructure;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-6
 * Time: 下午10:13
 * To change this template use File | Settings | File Templates.
 */
public class Singloten {
    private static Singloten instance;

    private static Singloten getInstance(){
        if(instance==null){
        synchronized(Singloten.class){
        if(instance==null){
            instance=new Singloten();
        }
        }
    }
        return instance;
    }
}
