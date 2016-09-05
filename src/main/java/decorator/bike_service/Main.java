package decorator.bike_service;

import decorator.bike_service.model.RoyalEnfield;
import decorator.bike_service.services.ChainCleaning;
import decorator.bike_service.services.Oiling;
import decorator.bike_service.services.Washing;

/**
 * Created by Gurinder on 9/5/2016.
 */
public class Main {
    public static void main(String[] args) {
        Bike royalEnfield = new RoyalEnfield();
        royalEnfield = new Washing(royalEnfield);
        royalEnfield = new Oiling(royalEnfield);
        royalEnfield = new ChainCleaning(royalEnfield);
        System.out.println("Details: " + royalEnfield.getDescription() + " total cost: " + royalEnfield.cost());

    }
}
