package strategy.navigator;

public class MainNavigator {

    public static void main(String[] args) {

        // Bus Navigator
        ShowBusRouteNavigator busRouteNavigator = new ShowBusRouteNavigator(new BusRouteStrategy());
        busRouteNavigator.showRoute();

        // Walk Navigator
        ShowWalkRouteNavigator walkRouteNavigator = new ShowWalkRouteNavigator(new WalkRouteStrategy());
        walkRouteNavigator.showRoute();

        // Car Navigator
        ShowCarRouteNavigator carRouteNavigator = new ShowCarRouteNavigator(new CarRouteStrategy());
        carRouteNavigator.showRoute();
    }
}
