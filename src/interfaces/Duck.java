package interfaces;

/**
 * Created by gorobec on 08.05.16.
 */
public class Duck implements Flyable, Swimable, Walkable {
    @Override
    public void fly() {
        System.out.println("I'm duck i can fly");
    }

    @Override
    public final void swim() {
        System.out.println("I'm duck i can swim with paws");

    }

    @Override
    public void walk() {
        System.out.println("I'm duck");

    }
}
