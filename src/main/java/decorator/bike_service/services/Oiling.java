package decorator.bike_service.services;

import decorator.bike_service.Bike;
import decorator.bike_service.BikeServiceDecorator;

/**
 * Created by Gurinder on 9/5/2016.
 */
public class Oiling extends BikeServiceDecorator {
    private Bike bike;

    public Oiling(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + ", Oiling";
    }

    @Override
    public double cost() {
        return bike.cost() + 300;
    }
}