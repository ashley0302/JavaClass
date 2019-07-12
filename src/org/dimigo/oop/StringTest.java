package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        //1.문자열 리터럴 방식
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);

        //2. new 생성 방식
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);

        System.out.println(dog1.equals(dog2));
        System.out.println(cat1.equals(cat2));

        String id ="null";
        //id가 "admin"이면 "관리자임" 출력
        //"admin"이 아니면 "관리자 아님" 출력
        if("admin".equalsIgnoreCase(id)){
            System.out.println("관리자임");
        }
        else{
            System.out.println("관리자 아님");
        }

        testString();


    }

    private static void testString(){
        //          01234567890123
        String s = "abcdefgABCDEFG";
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));
        System.out.println(s.indexOf("C"));
        System.out.println(s.charAt(3));
        System.out.println(("            ABC                                         ").trim());
        System.out.println(s.replace('a','A'));
        System.out.println(s.startsWith("abc"));
        System.out.println(s.endsWith("eee"));

    }
}
