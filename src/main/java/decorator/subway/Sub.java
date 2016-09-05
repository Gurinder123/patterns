package decorator.subway;

/**
 * Created by Gurinder on 9/5/2016.
 */
abstract public class Sub {
    public String description = "unKnown";

    public Sub() {
    }

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
