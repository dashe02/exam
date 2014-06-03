package ioc;



import org.apache.commons.beanutils.PropertyUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午6:18
 * To change this template use File | Settings | File Templates.
 */
public class Container {
    private Map<String,Object> components;
    public Container(){
        components=new HashMap<String, Object>();
        try{
            Properties properties=new Properties();
            //load properties file
            InputStream istr=this.getClass().getResourceAsStream("/components.properties");
            properties.load(istr);
            for(Map.Entry entry:properties.entrySet()){
                String key=(String)entry.getKey();
                String value=(String)entry.getValue();
                processEntry(key,value);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void processEntry(String key,String value)throws Exception{
        String[] parts=key.split("\\.");
        //new component definition
        if(parts.length==1){
              //reflection
             Object component=Class.forName(value).newInstance();
             components.put(parts[0],component);
        }else{
            Object component=components.get(parts[0]);
            Object reference=components.get(value);
            PropertyUtils.setProperty(component,parts[1],reference);
        }
    }
    public Object getComponent(String id){
        return components.get(id);
    }
}
