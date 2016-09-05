package decorator.subway;

/**
 * Created by Gurinder on 9/5/2016.
 */
public class NonVegSub extends Sub {

    public NonVegSub() {
        this.description = "NonVegSub";
    }

    @Override
    public double cost() {
        return 220;
    }
}
