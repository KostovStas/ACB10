package oop_2_week_2;

/**
 * Created by admin on 05.04.2016.
 */
public class Flofers {
    private String longStem;
    private  int price;
    private String color;
    private  String levelOfFreshness;

    public Flofers (String longStem,int price,String color,String levelOfFreshness ){
        this.longStem = longStem;
        this.price = price;
        this.color = color;
        this.levelOfFreshness = levelOfFreshness;
    }
    public Flofers (){

    }

    public String getLongStem(){
        return longStem;
    }
    public String getColor (){
        return color;
    }

    public String getLevelOfFreshness (){
        return levelOfFreshness;
    }
    public  void  setPrice (int price){
         this.price = price;
    }

    public void setLongStem(String longStem) {
        this.longStem = longStem;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLevelOfFreshness(String levelOfFreshness) {
        this.levelOfFreshness = levelOfFreshness;
    }

    @Override
    public String toString (){
        return String.format("Long stem is %s, color is %s, the level of freshness of the flower is %s",longStem,color,levelOfFreshness );
    }


}
