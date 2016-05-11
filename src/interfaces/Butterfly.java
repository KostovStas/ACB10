package interfaces;

/**
 * Created by gorobec on 08.05.16.
 */
public class Butterfly implements Flyable{

    @Override
    public void fly() {
        System.out.println("I'm butterfly, I can fly");
    }
}
