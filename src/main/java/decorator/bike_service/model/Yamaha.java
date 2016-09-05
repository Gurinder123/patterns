package decorator.bike_service.model;

import decorator.bike_service.Bike;

/**
 * Created by Gurinder on 9/5/2016.
 */
public class Yamaha extends Bike {
    private String description;

    public Yamaha() {
        this.description = "Yamaha";
    }

    @Override
    public double cost() {
        return 1000;
    }
}
