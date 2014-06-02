package org.java.test.messageresource;

import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-28
 * Time: 上午11:08
 * To change this template use File | Settings | File Templates.
 */
public class MessageFormatIin18 {
      public static void main(String[] args){
          MessageResourceFactory factory=MessageResourceFactory.getInstance();
          MessageResource res=factory.createMessageResource("message",new Locale("en","US"));
          String value=res.getString("button.add");
          System.out.println(value);
          String value_args=res.getString("message",new Object[]{"C","12"});
          System.out.println(value_args);
      }



}
