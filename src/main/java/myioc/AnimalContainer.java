package myioc;

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
 * Date: 14-6-3
 * Time: 上午9:23
 * To change this template use File | Settings | File Templates.
 */
public class AnimalContainer {
     private Map<String,Object> animals;

     public AnimalContainer(){
         animals=new HashMap<String, Object>();
         try{
             Properties properties=new Properties();
             InputStream ins=this.getClass().getResourceAsStream("/animals.properties");
             properties.load(ins);
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
      public void processEntry(String key,String value)throws Exception{
           String[] parts=key.split("\\.");
           if(parts.length==1){
               Object animal=Class.forName(value).newInstance();
               animals.put(parts[0],animal);
           }else{
               Object animal=animals.get(parts[0]);
               Object reference=animals.get(value);
               PropertyUtils.setProperty(animal,parts[1],reference);
           }
      }
      public Object getAnimal(String id){
          return animals.get(id);
      }
}
