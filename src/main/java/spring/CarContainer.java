package spring;

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
 * Time: 下午10:35
 * To change this template use File | Settings | File Templates.
 */
public class CarContainer {

    private Map<String,Object> components;

    public CarContainer(){
        components=new HashMap<String, Object>();
        try{
            Properties properties=new Properties();
            InputStream ins=this.getClass().getResourceAsStream("/components3.properties");
            properties.load(ins);
            for(Map.Entry entry:properties.entrySet()){
                String key=(String)entry.getKey();
                String value=(String)entry.getValue();
                processEntry(key,value);
               // System.out.println(key + "---" + value);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void processEntry(String key,String value) throws Exception{
        String[] parts=key.split("\\.");
        if(parts.length==1){
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
