package org.java.test.factory4;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:35
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        /*IAnimalFactory iAnimalFactory=new IAnimalFactory();
        IAnimal iAnimal=iAnimalFactory.animalType("2");
        iAnimal.eat();*/
        IAnimalFactory catFactory=new CatFactory();
        IAnimalFactory dogFactory=new DogFactory();
        IAnimal cat=catFactory.choseAnimal();
        IAnimal dog=dogFactory.choseAnimal();
        cat.eat();
        dog.eat();
    }
}
