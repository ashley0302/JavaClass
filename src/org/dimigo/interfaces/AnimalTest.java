package org.dimigo.interfaces;

public class AnimalTest {
    public static void main(String[] args) {
        //IAnimal.FARM_NAME = "디문 동물녿장";
        IAnimal.welcome();
        IAnimal[] animals = {
                new Dog(), new Cat()
        };
        for(IAnimal a : animals){
            a.eat();
            a.sleep();
            a.bark();
        }
    }
}
