package oop_1;

/**
 * Created by admin on 02.02.2016.
 */
public class TastPeople {
    public static void main(String[] args) {
        Person man = new Person();
        Person woman = new Person();
        woman.init("Mari",6,23);
        man.init("Roma",5,20);
        man.showPerson();

    }

}
