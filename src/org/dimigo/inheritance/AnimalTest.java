package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.bark();
        a.sleep();

        Dog d = new Dog("멍멍이");
        System.out.println(d);
        d.wag();
        d.bark();

        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.bark();

        Tiger t = new Tiger("호돌이");
        System.out.println(t);
        t.eat();
        t.bark();




















    }
}
