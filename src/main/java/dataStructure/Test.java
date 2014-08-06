package dataStructure;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午11:02
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void test(int n){
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
    public static void main(String[] args){
        test(1234);
        String s="";
        List<String> l1=new ArrayList();
        List l2=new ArrayList<String>();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       }
}
