package org.java.test.comparator;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-13
 * Time: 下午4:36
 * To change this template use File | Settings | File Templates.
 */
public class UtilTool {
    public static Date strToDate(String date,String format){
        Date d=null;
        try{
            SimpleDateFormat sf=new SimpleDateFormat();
            d=sf.parse(date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  d;
    }
}
