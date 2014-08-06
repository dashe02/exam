package property;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-31
 * Time: 上午10:46
 * To change this template use File | Settings | File Templates.
 */
public class MyDataSource {
    public void  getConnection(){
       try{
        Properties properties=new Properties();
        InputStream in=getClass().getResourceAsStream("/jdbc.properties");
        properties.load(in);
        String className=properties.getProperty("driverClass");
        String url=properties.getProperty("url");
        String username=properties.getProperty("username");
        String password=properties.getProperty("password");
        System.out.println(className+".");
        System.out.println(url+"..");
        System.out.println(username+"...");
        System.out.println(password+"....");
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    public static void main(String[] args)
    {
        new MyDataSource().getConnection();
    }
}
