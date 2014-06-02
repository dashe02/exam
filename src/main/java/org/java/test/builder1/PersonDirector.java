package org.java.test.builder1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午10:27
 * To change this template use File | Settings | File Templates.
 */
public class PersonDirector {
   public Person constructPerson(PersonBuilder pd){
       pd.buildHead();
       pd.buildBody();
       pd.buildFoot();
       return pd.PersonBuilder();
   }
}
