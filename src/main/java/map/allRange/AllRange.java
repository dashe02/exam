package map.allRange;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-26
 * Time: 上午10:06
 * To change this template use File | Settings | File Templates.
 */
public class AllRange {
    public static void ListAll(List canditions,String prefix){
        if(canditions.isEmpty()){
            System.out.println(prefix);
        }
        for(int i=0;i<canditions.size();i++){
            List temp=new LinkedList(canditions);
            ListAll(temp,prefix+temp.remove(i));
        }
    }
    public static void main(String[] args){
        int[] a=new int[]{1,2,2,3,4};
        String[] arrays=new String[a.length];
        for(int i=0;i<a.length;i++){
            arrays[i]="'"+a[i]+"'";
        }
        //ListAll(Arrays.asList(arrays),"");
        char c='A';
        byte b=(byte)c;
        System.out.print(b+"");
    }

}
