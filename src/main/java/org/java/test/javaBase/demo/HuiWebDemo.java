package org.java.test.javaBase.demo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-24
 * Time: 下午8:06
 * To change this template use File | Settings | File Templates.
 */
public class HuiWebDemo {
    public boolean isAym(char cbegin,char cend){
              while (cbegin<cend)
              {
                  if(cbegin!=cend)
                  {
                      return false;
                  }
                  cbegin++;
                  cend--;
              }
        return true;
    }

}
