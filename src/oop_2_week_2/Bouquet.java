package oop_2_week_2;

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

    public void addflowers (Flowers flowers){
        bouquetArrayList.add(flowers);

    }

    public void deleteFlower(String name){
        for (int i = 0; i <bouquetArrayList.size() ; i++) {
            if (bouquetArrayList.get(i).getName().equals(name)) {
                bouquetArrayList.remove(i);

            }
        }
    }

    public void showEachFlowerBouquet  () {
        System.out.println("Your bouquet consists of such flowerss:");
        for (int i = 0; i <bouquetArrayList.size() ; i++) {
            System.out.println(bouquetArrayList.get(i));
        }
    }

    public  void showpriceOfBouquet(){
        int priceOfBouquet = 0;
        for (int i = 0; i <bouquetArrayList.size() ; i++) {
             priceOfBouquet += bouquetArrayList.get(i).getPrice();

        }
        System.out.println("Your bouquet price is " + priceOfBouquet + " $");
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





    public  void sortBouquetOnFreechest (Bouquet bouquet){

        for (int i = 0; i <bouquetArrayList.size() ; i++) {


        }


        }

    }







