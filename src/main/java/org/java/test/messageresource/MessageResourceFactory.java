package org.java.test.messageresource;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-28
 * Time: 上午11:00
 * To change this template use File | Settings | File Templates.
 */
public class MessageResourceFactory {

      private static MessageResourceFactory factory=new MessageResourceFactory();

      private Map msgResourceMap=null;

      public MessageResourceFactory(){
          msgResourceMap=new HashMap();
      }
      public static MessageResourceFactory getInstance(){
          return factory;
      }
      public MessageResource createMessageResource(String fileResName,Locale locale){
          Object msgResObj=msgResourceMap.get(fileResName);
          if(msgResObj==null){
              ResourceBundle rb=ResourceBundle.getBundle(fileResName,locale);
              MessageResource msgRes=new MessageResource(rb);
              msgResourceMap.put(fileResName,msgRes);
              return msgRes;
          }else{
              return (MessageResource)msgResObj;
          }
      }
}
