package org.dimigo.inheritance;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    //부모 클래스의 메소드를 자식클래스에 재정의
    //-> 메소드 오버라이딩(Overriding)
    public void bark(){
        System.out.println("야오오오옹");
    }

    public void scratch(){
        System.out.println(name+"이/가 할퀸다.");
    }


}

