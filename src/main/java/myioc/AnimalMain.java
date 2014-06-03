package myioc;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-3
 * Time: 上午9:38
 * To change this template use File | Settings | File Templates.
 */
public class AnimalMain {
    public static void main(String[] args){
        AnimalContainer container=new AnimalContainer();
        AnimalService animalService=(AnimalService)container.getAnimal("animalService");
        animalService.animalEat();
    }
}
