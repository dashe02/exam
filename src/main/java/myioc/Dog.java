package myioc;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-3
 * Time: 上午9:22
 * To change this template use File | Settings | File Templates.
 */
public class Dog implements IAnimal{

    @Override
    public void eat() {
        System.out.println("dog eat.....");
    }
}
