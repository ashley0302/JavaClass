package org.dimigo.oop;
import java.util.Random;
import java.util.*;
import java.lang.String;//안써도 됨 생략가능

/**
 * 
 */
public class Car {


    private int horsePower;
    private double fuelEfficiency;
    private int price;
    private String company;
    private String design;


    public void drive() {
        System.out.println("운전합니다!");
    }


    public void turnRight(int angle) {
        System.out.println(angle +"도 우회전합니다.");
    }


    public void turnLeft(int angle) {
        System.out.println(angle +"도 좌회전합니다.");
    }


    public boolean stop() {
        System.out.println("정지합니다!");
        return true;
    }


    public void lightOn() {
       System.out.println("라이트를 켭니다!");
    }

}