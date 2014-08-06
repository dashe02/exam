package innerClass;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-31
 * Time: 上午10:01
 * To change this template use File | Settings | File Templates.
 */
public class Demo {
    private String demo="demo";
    public class innerDemo  implements Demo1,Demo2{
        @Override
        public void demo1() {
              System.out.println("demo-demo1");
        }

        @Override
        public void demo2() {
            System.out.println("demo-demo2");
        }
    }
    public  innerDemo getInnerDemo(){
        return new innerDemo();
    }
        public static void main(String[] args){
            Demo demo=new Demo();
            demo.getInnerDemo().demo1();
            demo.getInnerDemo().demo2();
            String d=demo.demo;
        }
}
