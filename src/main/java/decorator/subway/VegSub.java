package decorator.subway;

/**
 * Created by Gurinder on 9/5/2016.
 */
public class VegSub extends Sub {

    public VegSub() {
        this.description = "VegSub";
    }

    @Override
    public double cost() {
        return 110;
    }
}
