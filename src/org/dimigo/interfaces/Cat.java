package org.dimigo.interfaces;

public class Cat implements IAnimal{
    @Override
    public void eat() {
        System.out.println("얌얌");
    }

    @Override
    public void sleep() {
        System.out.println("쿨쿨");

    }

    @Override
    public void bark() {
        System.out.println("야아아ㅏ옹ㅇ");

    }
}

