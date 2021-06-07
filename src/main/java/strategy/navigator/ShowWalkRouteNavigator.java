package strategy.navigator;

public class ShowWalkRouteNavigator extends Navigator {

    private Strategy strategy;

    public ShowWalkRouteNavigator(Strategy strategy) {
        super(strategy);
        this.strategy = strategy;
    }

    @Override
    public void showRoute() {
        strategy.buildRoute();
    }
}
