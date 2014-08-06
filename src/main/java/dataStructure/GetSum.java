package dataStructure;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午6:23
 * To change this template use File | Settings | File Templates.
 */
public class GetSum {
    public static void getSum(int n,int sum){
        Set<Integer> s=getRandomNum(n,sum);

    }
    public static Set<Integer> getRandomNum(int n,int sum){
        Set<Integer> s=new HashSet<Integer>();
        Random random=new Random();
        for(int i=0;i<n;i++){
            int x=random.nextInt(n)+1;
            s.add(x);
        }
        return s;
    }
    public static void main(String[] args){
        getSum(7,5);
    }
}
