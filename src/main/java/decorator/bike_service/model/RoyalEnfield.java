package decorator.bike_service.model;

import decorator.bike_service.Bike;

/**
 * Created by Gurinder on 9/5/2016.
 */
public class RoyalEnfield extends Bike {

    public RoyalEnfield() {
        this.description = "Royal Enfield";
    }

    @Override
    public double cost() {
        return 1200;
    }
}
