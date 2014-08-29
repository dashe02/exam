package algorithm.sort.link;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-19
 * Time: 下午2:53
 * To change this template use File | Settings | File Templates.
 */
public class linkMerge {
    public static void linkMerge(LinkedList<Integer> list1,LinkedList<Integer> list2){
         LinkedList<Integer> temp1=new LinkedList<Integer>();
         LinkedList<Integer> temp2=new LinkedList<Integer>();
         temp1=list1;
         temp2=list2;
         for(int i=0;i<temp2.size();i++){
                 if(temp1.contains(temp2.get(i))){
                     temp1.remove(temp2.get(i));
                 }
         }
        temp1.addAll(temp2);
        for(int i=0;i<temp1.size();i++){
            System.out.println(temp1.get(i));
        }

    }
    public static void main(String[] args){
        LinkedList<Integer> list1=new LinkedList<Integer>();
        LinkedList<Integer> list2=new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(2);
        list2.add(3);
        list2.add(5);
        linkMerge(list1,list2);
    }
}
