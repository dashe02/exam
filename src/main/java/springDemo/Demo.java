package springDemo;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-31
 * Time: 上午9:12
 * To change this template use File | Settings | File Templates.
 */
public class Demo {
    public static Object demo(){
        Animal animal=new Animal() {
            @Override
            public String action() {
                return "Hello World!";
            }
        };
       return animal;
    }
   public static void main(String[] args){
        System.out.println(demo());
   }
}
