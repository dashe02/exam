package org.java.test.factory4;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:33
 * To change this template use File | Settings | File Templates.
 */
public interface IAnimalFactory {

 /*   public IAnimal animalType(String type){
        if(type.equals("1")){
             return new Cat();
        }else if(type.equals("2")){
             return new Dog();
        }
        return null;
    }*/
    public IAnimal choseAnimal();
}
