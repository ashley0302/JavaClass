package org.dimigo.collection;

import org.dimigo.interfaces.Dog;

import java.util.ArrayList;
import java.util.List;

public class listTest {
    public static void main(String[] args) {
        // list 계열 : ArrayList
//        List list = new ArrayList();
//        list.add("채린손");
//        list.add(100);
//        list.add(new Dog());
//        String s = (String)list.get(0);

        // 제네릭(Generic)
        List<String> list =  new ArrayList<String>();
        list.add("배");
        list.add("딸기");
        list.add("자몽");
        list.add(1,"포도");
        list.set(2,"바나나");
        printList(list);


        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));


        list.remove("딸기");
        printList(list);

        list.remove(0);
        printList(list);

        list.clear();
        printList(list);
    }

    private static void printList(List<String> list) {
        for(String value : list){
            System.out.print(value + "|");
        }
        System.out.println();
    }

}
