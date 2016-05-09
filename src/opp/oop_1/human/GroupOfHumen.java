package opp.oop_1.human;

import java.util.ArrayList;

public class GroupOfHumen {
    private String name;
    private int id;
    private ArrayList<Human_1> arrayListOfHuman_1 = new ArrayList<>();

    public GroupOfHumen (String name, int id){
        this.name= name;
        this.id= id;
    }

    public void addHuman (Human_1 human){

        arrayListOfHuman_1.add(human);
    }
    public  void deleteOfHuman (String name){

        Human_1 tmp = new Human_1(name, "", 13, "male");

        arrayListOfHuman_1.remove(tmp);
    }

    public String toString(){

        return name;
    }

    public void showGroupOfHuman (){
        for (int i = 0; i <arrayListOfHuman_1.size() ; i++) {
            System.out.println(arrayListOfHuman_1.toString() + " ");

        }

    }

}
