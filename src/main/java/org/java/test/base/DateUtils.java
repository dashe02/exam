package org.java.test.base;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-22
 * Time: 下午9:15
 * To change this template use File | Settings | File Templates.
 */
public class DateUtils {

    //获取当前时间
    public String getNowDate(){
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s=sdf.format(d);
        return s;
    }
    //当前时间+若干秒
    public String getDataAfterSeconds(String date,int secondcount){
        String afterDate=null;
        try
       {
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           Date d=sdf.parse(date);
           d.setSeconds(d.getSeconds()+secondcount);
           afterDate=sdf.format(d);
       }catch (Exception e){

       }
         return afterDate;

    }
    public Date StringToDate(String str){
        Date d=null;
        try{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            d=sdf.parse(str);
        }catch (Exception e){
            e.printStackTrace();
        }
          return d;
    }
    public int[][] getDistance(int n){
          int[][] distance=new int[n][n];
          for(int i=1;i<=n;i++){
              for(int j=i+1;j<=n;j++){
                  distance[i][j]=distance[i][j-1]+getDistance("lat"+i,"lng"+i,"lat"+j,"lng"+j);
              }
          }
         return distance;
    }
    public int getDistance(String a1,String a2,String a3,String a4){
        return 0;
    }
    public static void main(String[] args){
        DateUtils dateUtils=new DateUtils();
        /*System.out.println(dateUtils.StringToDate("2014-05-22 21:21:40"));*/
        //此数组代表1-2,2-3,3-4,4-5站的距离，可以
        int[] a={0,1,3,2,6};

    }



}
