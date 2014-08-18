package reflectTest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午4:36
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        CarFactory carFactory=new CarFactory();
        ICar icar=carFactory.getCar("audi");
        icar.start();
    }
}
