package decorator.bike_service;

/**
 * Created by Gurinder on 9/5/2016.
 */
abstract public class Bike {
    public String description = "unKnown";

    public Bike() {

    }

    public String getDescription() {
        return description;
    }


    abstract public double cost();
}
