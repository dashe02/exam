package monogoconnector;
import java.util.ResourceBundle;
/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-2
 * Time: 下午10:10
 * To change this template use File | Settings | File Templates.
 */
public class MongoConnector {
     //private static Mongo mongo;
     private String dbName;
     private String collectionName;

    static {
        ResourceBundle bundle=ResourceBundle.getBundle("mongo");
        if(bundle==null){
            throw new IllegalArgumentException("[mongo.properties] is not found!");
        }
        String host=bundle.getString("mongo.host");
        String port=bundle.getString("mongo.port");
        try{
           // mongo=new Mongo(host,Integer.parseInt(port));
            System.out.print("mongo is initialized,host is"+host+",port is"+port);
        }catch (Exception e){

        }
    }



}
