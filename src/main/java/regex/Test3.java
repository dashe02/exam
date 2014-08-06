package regex;

import sun.security.util.BigInt;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-4
 * Time: 上午10:33
 * To change this template use File | Settings | File Templates.
 */
public class Test3 {
    public static void main(String[] args){
        BigInteger one=new BigInteger("1");
        BigInteger two=new BigInteger("2");
        BigInteger three=new BigInteger("3");
        BigInteger sum=new BigInteger("0");
        sum=sum.add(one);
        sum=sum.add(two);
        sum=sum.add(three);
        System.out.println(sum.toString());
    }
}
