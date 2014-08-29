package exam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-26
 * Time: 下午8:07
 * To change this template use File | Settings | File Templates.
 */
public class TestEquals {
    private String value=null;

    public TestEquals(String v){
        this.value=v;
    }

    public boolean equals(TestEquals o){
        if(o==this)
            return true;
        if(o instanceof TestEquals){
            TestEquals test=(TestEquals)o;
            return value.equals(test.value);
        }
        return false;
    }
     public static void main(String[] args){
         List list=new ArrayList();
         TestEquals test1=new TestEquals("object");
         TestEquals test2=new TestEquals("object");
         TestEquals test3=new TestEquals("object");
         Object test4=new TestEquals("object");
         list.add(test1);
         System.out.println(list.contains(test2));
         System.out.println(test2.equals(test3));
         System.out.println(test3.equals(test4));
     }
}
