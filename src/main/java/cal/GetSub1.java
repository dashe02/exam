package cal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-11
 * Time: 下午8:21
 * To change this template use File | Settings | File Templates.
 */
public class GetSub1 {
    public static void listAll(List candidate,String prefix){
       System.out.println(prefix);
       for(int i=0;i<candidate.size();i++){
           List temp=new LinkedList(candidate);
           listAll(temp,prefix+temp.remove(i));
       }
    }
    public static void main(String[] args){
        String[] array={"1","2","3","4"};
        listAll(Arrays.asList(array),"");
    }
}
