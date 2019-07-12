package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //기본형 타입 배열
        // int, long, boolean, char, double
        int[] intArr = new int[5];
        printArray(intArr);
        double[] doubleArr = new double[5];
        printArray(doubleArr);

        int[] intArr2 = new int[]{1,2,3,4,5};
        printArray(intArr2);

        // 참조형 타입 배열
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "치킨";
        strArr[1] = "옥동자";
        strArr[2] = "박카스";
        printArray(strArr);

        String[] strArr2 = new String[] {"트와이스","블랙핑크","이종복"};
        printArray(strArr2);

        //Book 타입 배열 2개짜리 생성
        //Book 객체 생성 후 출력

        //Book[] book = new Book[2];
        //book[0] = new Book("개념완성","EBS",200);
        //book[1] = new Book("화학","김종수",300);


        Book[] book = new Book[]{
                new Book("개념완성","EBS",200)
        };
        printArray(book);

        int[] intArr3 =  new int[3];
        System.out.println(intArr3.length);
        System.out.println(intArr3[intArr3.length-1]);

        String[] strArr3 = new String[3];
        System.out.println(strArr3[0]);
        System.out.println(strArr3[0].length());

        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0].getTitle());




    }
    private static void printArray(Book[] book) {
        for(Book i: book){
            System.out.println(i);
        }
    }

    private static void printArray(String[] strArr) {
        for(String i: strArr){
            System.out.print(i + "|");
            System.out.println();
        }
    }

    private static void printArray(double[] doubleArr) {

        for (double i : doubleArr) {
            System.out.print(i + "|");

        }
    }


    private static void printArray(int[] intArr) {
        //int Arr 배열 요소값 출력
        for(int i : intArr){
            System.out.print(i+ "|");
        }
        //double 타입 5개짜리 배열 생성 ㅎ 출력

    }
}

