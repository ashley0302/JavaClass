package org.dimigo.oop;

import java.util.*;

public class Basket {


    private String itemName[];
    private int itemAmount[];
    private int itemPrice[];
    private String itemDes[];
    private String itemImage[];

    public boolean add(String name, int amount, int price, String des, String image) {

        System.out.printf("상품이 추가되었습니다 : %s\n%d 개\n%d 원\n%s\n이미지경로:%s", name, amount, price, des, image);
        return true;

    }


    public boolean delete(int index) {

        System.out.println(index + "번 상품이 성공적으로 삭제되었습니다");
        return true;

    }


    public boolean alter(int index, int amount) {

        System.out.println(index + "번 상품의 수를 성공적으로 수정하였습니다 : " + amount + "개");
        return true;

    }


    public String view() {

        return itemName.toString();

    }


    public boolean order() {

        System.out.println("성공적으로 주문이 완료되었습니다");
        return true;

    }

}