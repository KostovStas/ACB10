package interfaces;

/**
 * Created by gorobec on 08.05.16.
 */
public class DuckType1 extends Duck {
    private final String name;

    public DuckType1(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
