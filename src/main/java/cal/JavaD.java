package cal;

import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-10
 * Time: 下午10:00
 * To change this template use File | Settings | File Templates.
 */
public class JavaD {
    public static int tryTest(){
        int i=0;
        try{
          i++;
          return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(i + "mm");
        }
        return 0;
    }
    public static void main(String[] args){
         System.out.print(tryTest());
         LinkedList s;
    }
}
