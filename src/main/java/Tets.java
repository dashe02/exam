/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-9
 * Time: 下午10:59
 * To change this template use File | Settings | File Templates.
 */
public class Tets {
    public static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+","+b);
    }
  public static void main(String[] args){
      int a=5,b=6;
      swap(a,b);
      Object o;
  }
}
