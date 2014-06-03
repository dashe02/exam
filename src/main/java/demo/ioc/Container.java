package demo.ioc;

import org.apache.commons.beanutils.PropertyUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午9:20
 * To change this template use File | Settings | File Templates.
 */
public class Container {
     private Map<String,Object> components;

     public Container(){
         components=new HashMap<String, Object>();
         try{
             Properties properties=new Properties();
             InputStream instr=this.getClass().getResourceAsStream("/components2.properties");
             properties.load(instr);
             for(Map.Entry entry:components.entrySet()){
                String key=(String)entry.getKey();
                String value=(String)entry.getValue();
                processEntry(key,value);
             }
         }catch(ClassNotFoundException e){
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
     public Object getComponent(Object id){
         return components.get(id);
     }



}
