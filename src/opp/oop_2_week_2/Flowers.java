package opp.oop_2_week_2;




    public class Flowers {
        private String name;
        private int longStem;
        private int price;
        private String color;
        private int levelOfFreshness;


        public Flowers(String name, int longStem, int price, String color, int levelOfFreshness) {
            this.name = name;
            this.price = price;
            this.longStem = longStem;
            this.color = color;
            this.levelOfFreshness = levelOfFreshness;
        }

        public Flowers() {

        }

        public int getPrice() {
            return price;
        }

        public int getLongStem() {
            return longStem;
        }

        public String getColor() {
            return color;
        }

        public int getLevelOfFreshness() {
            return levelOfFreshness;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setLongStem(int longStem) {
            this.longStem = longStem;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setLevelOfFreshness(int levelOfFreshness) {
            this.levelOfFreshness = levelOfFreshness;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("Flower name is %s. Long stem is %d, color is %s," +
                                    " the level of freshness of the flower is %s, price = %d",
                                    name, longStem, color, levelOfFreshness, price);

        }

        public void showFlowerName() {
            System.out.println("Flawer name is " + name);

        }
  /*  @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Flowers tmp = (Flowers) obj;
        if(!this.name.equals(tmp.name)) return false;

        return true;
    }*/


    }










