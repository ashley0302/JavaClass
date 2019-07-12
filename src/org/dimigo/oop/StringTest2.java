package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {

        String str = "디미고";
        str+= "2학년";
        str+= "6반";
        str+= "김종수";

        //2.StringBuilder
        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("6반 ").append("김종수");

        System.out.println(sb.toString());
        System.out.println();

        // 속도 비교 메소드

        comapareSpeed();

    }

    private static void comapareSpeed() {
        long start = System.currentTimeMillis();

        // 반복문
        String str="abc";
        StringBuffer sb = new StringBuffer("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        for(int i=0;i<100000;i++){
            sb2.append("def");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}

