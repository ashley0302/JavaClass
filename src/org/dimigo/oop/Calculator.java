package org.dimigo.oop;

public class Calculator {

    /*인스턴스 필드*/
        private int num1;
        private int num2;
        private boolean powerFlag;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    /*인스턴스 메소드*/
    public void PowerOff() {
        if(this.powerFlag==true) {
            System.out.println("전원을 끕니다,");
        }
        this.powerFlag = false;
    }

    public void PowerOn() {
        if(this.powerFlag == false) {
            System.out.println("전원을 켭니다.");
            this.powerFlag=true;
        }
    }

    public int add(){
        this.PowerOn();
        return this.num1+this.num2;
    }
    public int sub(){
        this.PowerOn();
        return this.num1-this.num2;
    }
    public int mul(){
        this.PowerOn();
        return this.num1*this.num2;
    }
    public double div(){
        this.PowerOn();
        return (double)this.num1/this.num2;
    }
}
