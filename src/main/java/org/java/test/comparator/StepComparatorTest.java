package org.java.test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-13
 * Time: 下午4:39
 * To change this template use File | Settings | File Templates.
 */
public class StepComparatorTest {
     public static void main(String[] args){
         List<Step> steps=new ArrayList<Step>();
         StepComparator comparator=new StepComparator();
         Collections.sort(steps,comparator);
         if(steps!=null&&steps.size()>0){
             for(Step step:steps){
                 System.out.println(step.getAcceptAddress());
                 System.out.println(step.getAcceptTime());
             }
         }
     }

}
