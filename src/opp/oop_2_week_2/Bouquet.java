package opp.oop_2_week_2;

import java.util.ArrayList;

/**
 * Created by admin on 06.04.2016.
 */
public class Bouquet {
    private String name;
    private ArrayList<Flowers>  bouquetArrayList = new ArrayList<Flowers>();

    public Bouquet (String name){
        this.name = name;
    }

    public Bouquet(ArrayList<Flowers> bouquetArrayList) {
        this.bouquetArrayList = bouquetArrayList;
    }

    public Bouquet (){
    }

    public boolean addFlowers(Flowers flowers){
        return bouquetArrayList.add(flowers);
    }

    public boolean deleteOneFlower(String name){
        for (int i = 0; i < bouquetArrayList.size(); i++) {
            if (bouquetArrayList.get(i).getName().equals(name)) {
                bouquetArrayList.remove(i);
//                exit from method
                return true;
            }
        }
        return false;
    }
    public boolean deleteAllFlowers(String name){
        boolean wasDeletion = false;
        for (int i = 0; i < bouquetArrayList.size(); i++) {
            if (bouquetArrayList.get(i).getName().equals(name)) {
                bouquetArrayList.remove(i);
                i--;
                wasDeletion = true;
            }
        }
        return wasDeletion;
    }

    public void showEachFlowerBouquet  () {
        System.out.println("Your bouquet consists of such flowerss:");
        for (int i = 0; i <bouquetArrayList.size() ; i++) {
            System.out.println(bouquetArrayList.get(i));
        }
    }

    public int showPriceOfBouquet(){
        int priceOfBouquet = 0;
        for (int i = 0; i <bouquetArrayList.size() ; i++) {
             priceOfBouquet += bouquetArrayList.get(i).getPrice();

        }
        return priceOfBouquet;
    }

    @Override
    public String toString(){
        return String.format("You bouquet has name %s", name);
    }

    public String getName(){
        return name;
    }

    public void showBouquetInfo (){
        System.out.printf("You bouquet has name %s", name);
    }





    public  void sortBouquetOnFreechest (){

        for (int j = bouquetArrayList.size(); j > 0; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (bouquetArrayList.get(i).getLevelOfFreshness() > bouquetArrayList.get(i + 1).getLevelOfFreshness()) {
                    Flowers temp = bouquetArrayList.get(i);
                    bouquetArrayList.set(i, bouquetArrayList.get(i + 1));
                    bouquetArrayList.set(i + 1, temp);
                }
            }
        }


    }

}







