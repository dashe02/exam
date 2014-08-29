package adapter;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-24
 * Time: 上午10:02
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args){
        Target target=new Adapter();
        target.get110v();
        target.get220v();
    }
}
