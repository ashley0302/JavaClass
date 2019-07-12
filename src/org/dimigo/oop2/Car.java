package org.dimigo.oop2;

public class Car {
    //정적 필드
    private static String company;
    //인스턴스 핑드
    private String name;
    // static block
    static {
        company = "기아";
        System.out.println("static block 호출");
    }

    public Car(String name){
        System.out.println("constructor 호출");
        this.name = name;
    }

    public String toString() {
        return company +":" + name;
    }

    public static String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }
}
