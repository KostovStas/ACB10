package data_structures;

import java.util.ArrayList;

/**
 * Created by gorobec on 12.04.16.
 */
public class TestAL {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        System.out.printf("List size - %d\n", list.size());

        for (int i = 0; i < 13; i++) {
            list.add(i);
            System.out.printf("List size - %d\n", list.size());
        }

        System.out.println(list.get(5));
        System.out.println(list.get(15));


    }
}
