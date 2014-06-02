package org.java.test.factory4;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:39
 * To change this template use File | Settings | File Templates.
 */
public class DogFactory implements IAnimalFactory{

    public IAnimal choseAnimal(){
        return new Dog();
    }
}
