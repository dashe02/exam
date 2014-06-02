package org.java.test.messageresource;


import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-28
 * Time: 上午10:48
 * To change this template use File | Settings | File Templates.
 */
public class MessageResource {

      private ResourceBundle rb;      //资源绑定

      public MessageResource(ResourceBundle rb){
          this.rb=rb;
      }

      public String getString(String key){
          try{
              return rb.getString(key);
          }catch(MissingResourceException e){
              return "undefined";
          }
      }
      public String getString(String key,Object[] args){
          try{
              String temp=rb.getString(key);
              MessageFormat mFormat=new MessageFormat(temp);
              return mFormat.format(temp,args);
          }catch (MissingResourceException ex){
              return "undefined";
          }
      }
}
