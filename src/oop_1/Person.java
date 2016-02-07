package oop_1;

/**
 * Created by admin on 02.02.2016.
 */
public class Person {
    String name;
    int age;
    int ves;
    int height;

    public void init (String name, int age, int ves) {
        this.name = name;
        this.age=age;
        this.ves=ves;

    }
    public void showPerson () {
        System.out.println( name +age +ves +height);
    }


}
