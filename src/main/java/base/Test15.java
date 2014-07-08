package base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午7:15
 * To change this template use File | Settings | File Templates.
 */
public class Test15 {
        public static void transferNumberToDate(long l){
            Date d=new Date(l);
            GregorianCalendar gc=new GregorianCalendar();
            gc.setTime(d);
            SimpleDateFormat sdf=new SimpleDateFormat("DDD:HH:MM:SS");
            String sb=sdf.format(gc.getTime());
            System.out.println(sb);
        }
    public static void main(String[] args){
            long ll=100000;
            transferNumberToDate(ll);
    }
}
