package oop_2_week_2;

/**
 * Created by admin on 06.04.2016.
 */
public class CreateBouquet {
    public static void main(String[] args) {
        // create flowers
        Flowers rose = new Flowers("rose",70,5, "blu", 4);
        Flowers rose2 = new Flowers("rose",70,5, "red", 2);
        Flowers rose3 = new Flowers("rose",70,5, "yellow", 1);
        Flowers rose4 = new Flowers("rose",70,5, "green", 3);
        Flowers chamomile = new Flowers("chamomile",30,1,"white",2);
        Flowers gerbera = new Flowers("gerbera",50,5,"red",1);
        Flowers carnation = new Flowers("carnation",50,4,"red",5);
        Flowers tulip = new Flowers("tulip",50,5,"red",3);
        Flowers dracaena = new Flowers("dracaena",45,3,"green",4);
        // create bouquet
        Bouquet bouquet1 = new Bouquet("Mix");
        Bouquet bouquet2 = new Bouquet("Wildflowers");
        // add flowers in bouquet1
        bouquet1.addFlowers(rose);
        bouquet1.addFlowers(rose2);
        bouquet1.addFlowers(rose3);
        bouquet1.addFlowers(rose4);
        bouquet1.addFlowers(gerbera);
        bouquet1.addFlowers(chamomile);
        // add flowers in bouquet2
        bouquet2.addFlowers(carnation);
        bouquet2.addFlowers(tulip);
        bouquet2.addFlowers(dracaena);
        // show bouquet1
        bouquet1.showEachFlowerBouquet();
        // show price of bouquet
        showBouquetPrice(bouquet1);
        // delete a flower in bouquet
        bouquet1.deleteAllFlowers("rose");
        System.out.println("----------");
        // show bouquet after remote some flower
        bouquet1.showEachFlowerBouquet();
        // show info about your bouquet
        bouquet2.showBouquetInfo();
        bouquet1.showEachFlowerBouquet();
    }

    private static void showBouquetPrice(Bouquet bouquet) {
        System.out.println("Your bouquet price is " + bouquet.showPriceOfBouquet() + " $");
    }
}
