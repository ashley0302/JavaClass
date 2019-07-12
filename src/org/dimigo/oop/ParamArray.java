package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        add(intArr, 10);
        printArray(intArr);       //11,12,13,14,15;

        String[] names ={"홍길동","홍길서", "홍길남", "홍길북"};
        changeName(names, "김");
        printArray(names);
    }
    private static void changeName(String[] names, String N){
        for(int i=0;i<names.length;i++){
            names[i] = N+ names[i].substring(1);
            //names[i] =names[i].replaceFirst("홍",N);
        }

    }

    private static void printArray(String[] names) {
        for(String arr : names){
            System.out.println(arr);
        }
    }

    private static void printArray(int[] intArr) {
        for(int a :intArr){
            System.out.println(a);
        }
    }

    private static void add(int[] intArr, int n){
        for(int i=0;i<intArr.length;i++){
            intArr[i]+=n;
        }
    }



}
