package interfaces;

/**
 * Created by gorobec on 08.05.16.
 */
public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("I'm fish, i can swim with fins");
    }
}
