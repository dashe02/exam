package cal;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-12
 * Time: 下午11:35
 * To change this template use File | Settings | File Templates.
 */
public class Comp implements Comparable<Comp>{
    private int x;
    private int y;

    @Override
    public int compareTo(Comp o) {
        return x-o.x;  //To change body of implemented methods use File | Settings | File Templates.
    }

    Comp(int x,int y){
       this.x=x;
       this.y=y;
    }

    public String toString(){
        return x+" "+y;
    }

    public static void main(String[] args){
        Comp c1=new Comp(3,3);
        Comp c2=new Comp(1,1);
        Comp c3=new Comp(5,3);
        Comp c4=new Comp(4,3);
        TreeSet<Comp>treeSet1=new TreeSet<Comp>();
        System.out.println(treeSet1.add(c1));
        System.out.println(treeSet1.add(c2));
        System.out.println(treeSet1.add(c3));
        System.out.println(treeSet1.add(c4));
        for(Comp comp:treeSet1){
            System.out.println(comp);
        }
        LinkedList<Comp> list=new LinkedList<Comp>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        Collections.sort(list);
        for(Comp comp:list){
            System.out.println(comp);
        }
    }

}
