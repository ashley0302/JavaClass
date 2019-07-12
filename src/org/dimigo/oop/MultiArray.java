package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int[2][3];
        printArray(intArr);

        intArr[0][2] = 100;
        intArr[1][1] = 100;

        //String[][] string  = {{"c","c++","java"},{"c#","php"}};

        String[][] string  = {
                new String[]{"c","c++","java"},
                new String[]{"c#","php"}
        };

//        String[][] string = new String[][]{
//                new String[] {"c","c++","java"},
//                new String[] {"c#","php"}
//        };

        printArray2(string);
    }

    private static void printArray2(String[][] string) {
        for(String[] arr:string){
            for(String value:arr){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
    //String 타입 2차원 배열
    //c, c++, java, c#, php



    private static void printArray(int[][] intArr) {

        for(int[] arr: intArr){
            for(int value:arr){
                System.out.print(value+"|");
            }
            System.out.println("\n");
        }
    }
}
