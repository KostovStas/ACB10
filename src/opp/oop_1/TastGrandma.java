package opp.oop_1;


public class TastGrandma {
    public static void main(String[] args) {
        Grandma babulya = new Grandma();
        babulya.name= "Emma";
        babulya.age=80;
        Cat cat = new Cat();
        cat.age = 7;
        //cat.name = "Matroskin";
        babulya.cat = cat;
        //babulya.cat.name = "Vas'ka";


    }
}
