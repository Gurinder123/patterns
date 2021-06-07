package strategy.navigator;

public class BusRouteStrategy implements Strategy {

    @Override
    public void buildRoute() {
        System.out.println("Travel via Bus");
    }
}
