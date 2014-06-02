package org.java.test.factory4;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-12
 * Time: 下午4:38
 * To change this template use File | Settings | File Templates.
 */
public class CatFactory implements IAnimalFactory{

    public IAnimal choseAnimal(){
        return new Cat();
    }
}
