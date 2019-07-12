package org.dimigo.oop;

public class Calculator2 {

    private boolean powerFlag;
    public static double PI = 3.14592;

    /*인스턴스 메소드*/
    public void PowerOff() {
        if(powerFlag==true) {
            System.out.println("전원을 끕니다,");
        }
        powerFlag = false;
    }
    public void PowerOn() {
        if(powerFlag == false) {

            System.out.println("전원을 켭니다.");
            powerFlag=true;
        }
    }

    public static int add(int num1, int num2, Calculator2 c){
        c.PowerOn();
        return num1+ num2;
    }
    public static int sub(int num1,int num2, Calculator2 c){
        c.PowerOn();
        return num1 - num2;
    }
    public static int mul(int num1, int num2, Calculator2 c){
        c.PowerOn();
        return num1*num2;
    }
    public static double div(int num1, int num2, Calculator2 c){
        c.PowerOn();
        return (double)num1/num2;
    }
}
