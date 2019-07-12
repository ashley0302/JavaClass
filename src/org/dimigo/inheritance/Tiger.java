package org.dimigo.inheritance;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    public void bark(){
        System.out.println("어흐흐흐흥");
    }
    public void hunt(){
        System.out.println(name+"이/가 사냥을 한다.");
    }
}
