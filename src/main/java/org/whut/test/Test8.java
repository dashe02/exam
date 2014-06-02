package org.whut.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-17
 * Time: 下午10:25
 * To change this template use File | Settings | File Templates.
 */
public class Test8 {
    public void transferMoney(int money){
          String thousand=null;
          String  hundred=null;
          String  ten=null;
          String  individual=null;
          int th=money/1000;
          int  hun=money%1000/100;
          int  t=money%100/10;
          int  in=money%10;
          thousand=monetMapper(th);
          hundred=monetMapper(hun);
          ten=monetMapper(t);
          individual=monetMapper(in);
          if(hundred!=null&&ten!=null&&individual!=null){
           //xx千xx百xx拾xx元整
          System.out.println(thousand+"千"+hundred+"百"+ten+"拾"+individual+"元整");
          }else if(hundred==null&&ten!=null&&individual!=null){
          System.out.println(thousand+"千"+"零"+ten+"拾"+individual+"元整");
          }else if(hundred!=null&&ten==null&&individual!=null){
          System.out.println(thousand+"千"+hundred+"百"+"零"+individual+"元整");
          }else if(hundred!=null&&ten!=null&&individual==null){
          System.out.println(thousand+"千"+hundred+"百"+ten+"拾元整");
          }else if(hundred==null&&ten==null&&individual!=null){
          System.out.println(thousand+"千"+individual+"元整");
          }else if(hundred!=null&&ten==null&&individual==null){
          System.out.println(thousand+"千"+hundred+"百元整");
          }else if(hundred==null&&ten!=null&&individual==null){
          System.out.println(thousand+"千零"+ten+"拾元整");
          }
    }
    public  String monetMapper(int a){
           switch (a){
               case 1:
                   return "一";
               case 2:
                   return "二";
               case 3:
                   return "三";
               case 4:
                   return "四";
               case 5:
                   return "五";
               case 6:
                   return "六";
               case 7:
                   return "七";
               case 8:
                   return "八";
               case 9:
                   return "九";

           }
            return null;
    }
    public static void main(String[] args){
            Test8 t8=new Test8();
            t8.transferMoney(1121);
    }
}
