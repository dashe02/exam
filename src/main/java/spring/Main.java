package spring;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午10:53
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        CarContainer carContainer=new CarContainer();
        CarService carService=(CarService)carContainer.getComponent("carService");
        carService.carRun();
    }
}
