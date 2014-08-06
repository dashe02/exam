package map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-3
 * Time: 上午10:31
 * To change this template use File | Settings | File Templates.
 */
class classA{
       public void printValue(){
          System.out.println("classA");
       }
}
class  classB extends classA{
        public void printValue(){
            System.out.println("classB");
        }
}
public class Test {
    public static void main(String[] args){
        classB objectB=new classB();
        objectB.printValue();
        classA as=(classA)objectB;
        as.printValue();
        as=new classA();
        as.printValue();
    }
}
