package myioc;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-3
 * Time: 上午9:24
 * To change this template use File | Settings | File Templates.
 */
public class AnimalService {

      private IAnimal animalGenerate;

    public void setAnimalGenerate(IAnimal animalGenerate) {
        this.animalGenerate = animalGenerate;
    }

    public void animalEat(){
          animalGenerate.eat();
      }
}
