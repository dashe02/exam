package algorithm.sort.designPattern.Sigonlen;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午11:26
 * To change this template use File | Settings | File Templates.
 */
public class Sigonlen {
    private static Sigonlen instance=null;

    private Sigonlen(){

    }

    public static Sigonlen getInstance(){
        if(instance==null){
            synchronized (Sigonlen.class){
                if(instance==null){
                    instance=new Sigonlen();
                }
            }
        }
        return instance;
    }
}
