package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-14
 * Time: 上午12:12
 * To change this template use File | Settings | File Templates.
 */
public class StringDemo {
        private static final String MESSAGE="taobao";

        public static void main(String[] args){
            String a="tao"+"bao";
            String b="tao";
            String c="bao";
            System.out.println(a==MESSAGE);
            System.out.println((b+c)==MESSAGE);
        }
}
