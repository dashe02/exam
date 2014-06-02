package org.java.test.comparator;

import java.util.Comparator;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-13
 * Time: 下午4:32
 * To change this template use File | Settings | File Templates.
 */
public class StepComparator implements Comparator<Step> {

       public int compare(Step o1,Step o2){
           Date acceptTime1=UtilTool.strToDate(o1.getAcceptTime(),null);
           Date acceptTime2=UtilTool.strToDate(o1.getAcceptTime(),null);
           if(acceptTime1.after(acceptTime2))
               return 1;
               return -1;
       }

}
