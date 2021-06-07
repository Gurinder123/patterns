package strategy.navigator;

public class ShowBusRouteNavigator extends Navigator {

    private Strategy strategy;

    public ShowBusRouteNavigator(Strategy strategy) {
        super(strategy);
        this.strategy = strategy;
    }

    @Override
    public void showRoute() {
        strategy.buildRoute();
    }
}
