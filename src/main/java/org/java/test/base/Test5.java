package org.java.test.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-14
 * Time: 下午7:27
 * To change this template use File | Settings | File Templates.
 */
public class Test5 {

      public void merge(String[] s){
         //取出这个数组中的每个元素,然后以~分割
              String[] ss=null;
              for(int i=0;i<s.length-1;i++){
                  s[i]=compare(s[i],s[i+1]);
              }
          for(int j=0;j<s.length-1;j++){
              System.out.println(ss[j]);
          }
      }
      public Date strToDate(String str){   //将字符串转为日期
          Date d=null;
          try{
          SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
          d=sf.parse(str);
          }catch (Exception e){
              e.printStackTrace();
          }
          return d;
      }
    public String dateToStr(Date d){        //将日期转为字符串
        String s=null;
        try{
            SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
            s=sf.format(d);
        }catch (Exception e){
            e.printStackTrace();
        }
        return s;
    }
      public  static void main(String[] args){
          String[] s={"2013-08-01~2013-12-24 300","2013-08-07~2013-11-30 300","2013-11-01~2014-01-10 300"};
          new Test5().merge(s);
      }
         //1.价格一致，
           /*
             2013-08-01~2013-08-24 300
             2013-08-25~2013-09-30 300
             2013-08-25>2013-08-24
             返回 2013-08-01~2013-09-30 300
            */
         // 1.第二个时间的第一位>第一个时间的末尾，第一个时间的第一位+第二个时间第二位返回
         // 2.第二个时间的第一位<第一个时间的末尾
               /*
             2013-08-01~2013-08-31  300
             2013-08-25~2013-09-30  300
             返回 2013-08-01~2013-09-30   300
             2013-09-30>2013-08-31
           */
            //2.1 若第二个时间的第二位>第一个时间的第二位   第一个时间的第一位+第二个时间第二位返回
                /*
             2013-08-01~2013-09-30 300
             2013-08-25~2013-08-31  300
             返回 2013-08-01~2013-09-30   300
             2013-09-30>2013-08-31
           */
             //2.2  若第二个时间的第二位<第一个时间的第二位    第一个时间的第一位+第一个时间第二位返回
          //2.价格不一致
                     /*
             2013-08-01~2013-08-24 300
             2013-08-25~2013-09-30  500
             返回   2013-08-01~2013-08-24 300
                    2013-08-25~2013-09-30  500
              2013-08-25>2013-08-24
           */
           //1.第二个时间的第一位>第一个时间的末尾    不合并
            //2.第二个时间的第一位<第一个时间的末尾
           /*
             2013-08-01~2013-08-24 300
             2013-08-20~2013-09-30  500
             返回 2013-08-01~2013-08-20   300
                  2013-08-20~2013-09-30  500
              2013-09-30>2013-08-24
           */
            //2.1 若第二个时间的第二位>第一个时间的第二位   第一个时间的第一位+第二个时间的第一位+300返回，第二个时间第一段+第二个时间第二段+500返回
                /*
                  2013-08-01~2013-09-30    300
                  2013-08-20~2013-08-24  500
                  返回
                  2013-08-01~2013-08-20   300
                  2013-08-20~2013-08-24  500
                  2013-08-24~2013-09-30  300
              2013-08-24<2013-09-30
           */
            //2.2 若第二个时间的第二位<第一个时间的第二位   第一个时间的第一位+第二个时间的第一位+300返回，第二个时间第一段+第二个时间第二段+500返回,第二个时间第二段+第一个时间第二段+300返回
          public String compare(String entity1,String entity2){
              String[] entity1s=entity1.split(" ");
              String[] entity2s=entity2.split(" ");
              String[] entity1ss=entity1s[0].split("~");
              String[] entity2ss=entity2s[0].split("~");
              Date d11=strToDate(entity1ss[0]);    //2013-08-01
              Date d12=strToDate(entity1ss[1]);    //2013-08-31
              Date d21=strToDate(entity2ss[0]);    //2013-08-25
              Date d22=strToDate(entity2ss[1]);     //2013-09-30
              //1.d12和21比较
              if(d11.before(d21)){        //第一个日期的第一段<第二个日期的第二段
                  if(entity1s[1].equals(entity2s[1])){     //价格一致
                      if(d21.before(d12)){
                          String r1=null;
                          String r2=null;
                          if(d22.before(d12)){
                              r1=dateToStr(d11);
                              r2=dateToStr(d12);
                          }else{
                              r1=dateToStr(d11);
                              r2=dateToStr(d22);
                          }
                          String s=r1+"~"+r2+" "+entity1s[1];
                          return s;
                      }
                  }else{

                  }
              }else{
                  //交换两个变量
              }
              return null;
          }
          public String[] readFile(){   //读取一个File,返回一个上面形式的String数组;
                   return null;
          }


}



