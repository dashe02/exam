package base;

import sun.security.util.BigInt;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午10:44
 * To change this template use File | Settings | File Templates.
 */
public class Test20 {
    public static void calculate(BigDecimal a,BigDecimal b,char operator){
          switch (operator){
              case '+':
                  System.out.println(a.add(b));
                  break;
              case '-':
                  System.out.println(a.subtract(b));
                  break;
              case '*':
                  System.out.println(a.multiply(b));
                  break;
              case '/':
                  System.out.println(a.divide(b));
                  break;
          }
    }
    public static void main(String[] args){
        BigDecimal a=new BigDecimal("9876543210");
        BigDecimal b=new BigDecimal("1234567890");
        calculate(a,b,'+');
    }
}
