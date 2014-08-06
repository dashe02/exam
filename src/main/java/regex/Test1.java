package regex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-4
 * Time: 上午10:39
 * To change this template use File | Settings | File Templates.
 */
public class Test1 {
     /*
     * 实现一个数组中数到几然后出去
     */
    public static void findOne(List<Integer> list,int x){
          while(list.size()!=0){
          if(list.size()>=x){
              System.out.println(list.get(x-1));
              list.remove(list.get(x-1));
           }else if(list.size()>1&&list.size()<x){
               int y=x%(list.size());
               System.out.println(list.get(y-1));
               list.remove(list.get(y-1));
           }else if(list.size()==1){
              System.out.println(list.get(0));
              list.remove(list.get(0));
          }
          }
    }
    public static void main(String[] args){
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        findOne(list,5);
    }
}
