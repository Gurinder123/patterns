package decorator.subway;

import decorator.subway.breads.GarlicButter;

/**
 * Created by Gurinder on 9/5/2016.
 */
public class Main {
    public static void main(String[] args) {
        Sub vegSub = new VegSub();
        vegSub = new GarlicButter(vegSub);
        System.out.println("Cost: " + vegSub.cost() + " details: " + vegSub.getDescription());
    }
}
