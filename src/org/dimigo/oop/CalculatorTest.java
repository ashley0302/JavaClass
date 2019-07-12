package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 10, b= 20;
        Calculator c = new Calculator(a,b);


        //c.PowerOn();
        System.out.printf("%d + %d = %d\n",a,b,c.add());
        System.out.printf("%d - %d = %d\n",a,b,c.sub());
        System.out.printf("%d * %d = %d\n",a,b,c.mul());
        System.out.printf("%d / %d = %.1f\n",a,b,c.div());
        c.PowerOff();

    }
}
