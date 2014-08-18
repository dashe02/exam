package reflectTest;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
public class CarFactory {
    public ICar getCar(String car){
        Properties properties=new Properties();
        InputStream in=this.getClass().getResourceAsStream("/carInfo.properties");
        try{
            properties.load(in);
            String bmwCar=properties.getProperty("BmwCar");
            String audiCar=properties.getProperty("AudiCar");
            if(car.equals("bmw")){
                  ICar iCar=(ICar)Class.forName(bmwCar).newInstance();
                  return iCar;
            }else if(car.equals("audi")){
                ICar iCar=(ICar)Class.forName(audiCar).newInstance();
                return iCar;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
         return null;
    }
}
