package decorator.bike_service.services;

import decorator.bike_service.Bike;
import decorator.bike_service.BikeServiceDecorator;

/**
 * Created by Gurinder on 9/5/2016.
 */
public class ChainCleaning extends BikeServiceDecorator {
    private Bike biks;

    public ChainCleaning(Bike biks) {
        this.biks = biks;
    }

    @Override
    public String getDescription() {
        return biks.getDescription() + ", Chaining";
    }

    @Override
    public double cost() {
        return biks.cost() + 100;
    }
}
