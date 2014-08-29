package exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-26
 * Time: 下午9:43
 * To change this template use File | Settings | File Templates.
 */
class A1{
      public void printValue(){
          System.out.println("classA");
      }
}
class B1 extends A1{
    public void printValue(){
        System.out.println("classB");
    }
}
public class Test1 {
    public static void main(String[] args){
        B1 objectB=new B1();
        objectB.printValue();
        A1 objectA=(A1)objectB;
        objectA.printValue();
        objectA=new A1();
        objectA.printValue();
    }
}
