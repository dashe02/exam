package org.java.exam.calculate;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-1
 * Time: 下午3:00
 * To change this template use File | Settings | File Templates.
 */
public class ArithHelper {
    //默认除法运算精度
    private static final int DEF_DIV_SCALE=16;
    //这个类不能实例化
    private ArithHelper(){

    }
    /*
      提供精确的加法运算
      v1被加数
      v2加数
      return 两个参数的和
     */
     public static double add(double v1,double v2){
         BigDecimal b1=new BigDecimal(Double.toString(v1));
         BigDecimal b2=new BigDecimal(Double.toString(v2));
         return b1.add(b2).doubleValue();
     }
      public static double add(String v1,String v2){
          BigDecimal b1=new BigDecimal(v1);
          BigDecimal b2=new BigDecimal(v2);
          return b1.add(b2).doubleValue();
      }
      /*
      提供精确的减法运算
      v1被减数
      v2减数
      return 两个参数的差
       */
      public static double sub(double v1,double v2){
          BigDecimal b1=new BigDecimal(Double.toString(v1));
          BigDecimal b2=new BigDecimal(Double.toString(v2));
          return b1.subtract(b2).doubleValue();
      }
     public static double sub(String v1,String v2){
         BigDecimal b1=new BigDecimal(v1);
         BigDecimal b2=new BigDecimal(v2);
         return b1.subtract(b2).doubleValue();
     }
     /*
      提供精确的乘法运算
      v1 被乘数
      v2乘数
      return 两个参数的乘数
      */
    public static double mul(double v1,double v2){
        BigDecimal b1=new BigDecimal(Double.toString(v1));
        BigDecimal b2=new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }
    public static double mul(String v1,String v2){
        BigDecimal b1=new BigDecimal(v1);
        BigDecimal b2=new BigDecimal(v2);
        return b1.multiply(b2).doubleValue();
    }
    /*
       提供精确的除法
        v1被除数
        v2除数
        return 两个参数的商
     */
    public static double div(double v1,double v2){
      return div(v1,v2,DEF_DIV_SCALE);
    }
    public static double div(String v1,String v2){
        BigDecimal b1=new BigDecimal(v1);
        BigDecimal b2=new BigDecimal(v2);
        return b1.divide(b2,DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
     /*
     提供(相对)精度的除法运算,当发生除不尽的情况时,由scale参数指定精度,以后的数字四舍五入
       v1被除数
       v2除数
       scale表示需要精确到小数点以后几位
       return 两个参数的商
      */
     public static double div(double v1,double v2,int scale){
         if(scale<0){
               throw new IllegalArgumentException("The scale must be a positive integer or zero");
         }
         BigDecimal b1=new BigDecimal(Double.toString(v1));
         BigDecimal b2=new BigDecimal(Double.toString(v2));
         return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
     }
     /*
     提供精确的小数位四舍五入处理
     v需要四舍五入的数字
     scale小数点后保留几位
     return 四舍五入后的结果
      */
    public static double round(double v,int scale){
         if(scale<0){
             throw new IllegalArgumentException("The scale must be a positive integer or zero");
         }
        BigDecimal b=new BigDecimal(Double.toString(v));
        BigDecimal one=new BigDecimal("1");
        return b.divide(one,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
      public static double round(String v,int scale){
          if(scale<0){
              throw new IllegalArgumentException("The scale must be a positive integer or zero");
          }
          BigDecimal b=new BigDecimal(v);
          BigDecimal one=new BigDecimal("1");
          return b.divide(one,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
      }


}
