package map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-3
 * Time: 上午10:48
 * To change this template use File | Settings | File Templates.
 */
public class ChildClass extends FatherClass{

    ChildClass(){
        System.out.println("childClass constructor");
    }
    @Override
    public void say() {
        System.out.println("childSay");
    }
    public static void main(String[] args){
        ChildClass childClass=new ChildClass();
        childClass.say();
    }
}
