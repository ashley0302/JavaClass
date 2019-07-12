package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("잔나비",27,180,70);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("마재연",18,170,65,"2609");
        System.out.println(s);
        s.rollCall();
        s.study();
        s.eat();
        s.sleep();

        Teacher t = new Teacher("김종수",28, 170, 65,"chemical");
        System.out.println(t);
        t.doTask();
        t.teach();
        t.eat();
        t.sleep();

    }
}
