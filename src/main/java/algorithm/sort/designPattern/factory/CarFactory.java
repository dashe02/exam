package algorithm.sort.designPattern.factory;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午11:32
 * To change this template use File | Settings | File Templates.
 */
public class CarFactory {

      public ICar getCar(String car){
          if(car.equals("bmw")){
              return new BmwCar();
          }else if(car.equals("audi")){
              return new AudiCar();
          }
          return null;
      }
}
