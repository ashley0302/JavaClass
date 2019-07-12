package org.dimigo.interfaces;

public interface IAnimal {
    //모든 메소드는 추상메소드
    public static final String FARM_NAME = "디미 동물농장";
    String FARM_NAME2 = "디미 동물농장";
    //public abstract void eat(); //자동으로 public
    //abstract void sleep();
    default void eat() {
        System.out.println("얌얌");
    }

    default void sleep() {
        System.out.println("쿨쿨");

    }
    //static 메소드(자동으로 public이 붙음)
    public static void welcome(){
        System.out.println(FARM_NAME+"에 오신걸 환영합니다");
    }
    void bark();

}
