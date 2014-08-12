package exam;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-8
 * Time: 下午8:22
 * To change this template use File | Settings | File Templates.
 */
public class GetSum {
    public static BigInteger getSum(BigInteger a,BigInteger b){
            return  a.add(b);
    }

    public static void main(String[] args){
        BigInteger a=new BigInteger("1234567891011121314151617181920");
        BigInteger b=new BigInteger("2019181716151413121110987654321");
        System.out.println(getSum(a,b));
    }
}
