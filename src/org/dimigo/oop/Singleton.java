package org.dimigo.oop;

public class Singleton {

    private static Singleton son;

    private Singleton(){ }

    public static Singleton getInstance(){
        if(son==null){
            son= new Singleton();
        }
        return son;
    }




}
