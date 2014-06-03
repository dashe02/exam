package spring;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午10:33
 * To change this template use File | Settings | File Templates.
 */
public class CarService {
      private ICar carGenerator;

    public void setCarGenerator(ICar carGenerator) {
        this.carGenerator = carGenerator;
    }

    public void carRun(){
        carGenerator.run();
    }
}
