package oop_2_week_2;

import classwork.Array;

import java.awt.*;

/**
 * Created by admin on 06.04.2016.
 */
public class CreateBouquet {
    public static void main(String[] args) {
        // create flowers
        Flowers rose = new Flowers("rose",70,5, "blu", 1, "with ribbons");
        Flowers chamomile = new Flowers("chamomile",30,1,"white",2);
        Flowers gerbera = new Flowers("gerbera",50,5,"red",1);
        Flowers carnation = new Flowers("carnation",50,4,"red",5,"with a branch of fern");
        Flowers tulip = new Flowers("tulip",50,5,"red",3);
        Flowers dracaena = new Flowers("dracaena",45,3,"green",4);
        // create bouquet
        Bouquet bouquet1 = new Bouquet("Mix");
        Bouquet bouquet2 = new Bouquet("Wildflowers");
        // add flowers in bouquet1
        bouquet1.addflowers(rose);
        bouquet1.addflowers(gerbera);
        bouquet1.addflowers(chamomile);
        // add flowers in bouquet2
        bouquet2.addflowers(carnation);
        bouquet2.addflowers(tulip);
        bouquet2.addflowers(dracaena);
        // show bouquet1
        bouquet1.showEachFlowerBouquet();
        // show price of bouquet
        bouquet1.showpriceOfBouquet();
        // delete a flower in bouquet
        bouquet1.deleteFlower("rose");
        System.out.println("----------");
        // show bouquet after remote some flower
        bouquet1.showEachFlowerBouquet();
        // show info about your bouquet
        bouquet2.showBouquetInfo();
        bouquet1.showEachFlowerBouquet();









    }
}
