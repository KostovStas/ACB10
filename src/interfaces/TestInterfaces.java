package interfaces;

/**
 * Created by gorobec on 08.05.16.
 */
public class TestInterfaces {
    public static void main(String[] args) {
        Sky sky = new Sky();
        Ocean ocean = new Ocean();
        Earth earth = new Earth();
        Duck duck = new Duck();

        Butterfly butterfly = new Butterfly();
        Ant ant = new Ant();
        Fish fish = new Fish();
        DuckType1 kalichka = new DuckType1("Ne plovec");

        sky.doAction(butterfly);
        ocean.doAction(fish);
        earth.doAction(ant);
        sky.doAction(duck);
        earth.doAction(duck);
        ocean.doAction(duck);
        ocean.doAction(kalichka);
        sky.doAction(kalichka);

    }
}
