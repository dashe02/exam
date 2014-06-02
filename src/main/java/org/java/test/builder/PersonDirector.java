package org.java.test.builder;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 上午9:57
 * To change this template use File | Settings | File Templates.
 */
public class PersonDirector {
  public Person constructPerson(PersonBuilder pb){
      pb.buildHead();
      pb.buildBody();
      pb.buildFoot();
      return pb.PersonBuilder();
  }
}
