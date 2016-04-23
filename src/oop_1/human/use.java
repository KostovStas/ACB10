package oop_1.human;

/**
 * Created by admin on 31.03.2016.
 */
public class use {
    public static void main(String[] args) {
        Human_1 human_1 = new Human_1("Ivan","Petrov",27,"man");
        GroupOfHumen groupOfHumen = new GroupOfHumen("Group_1",1);
        groupOfHumen.addHuman(human_1);
        groupOfHumen.showGroupOfHuman();


    }
}
