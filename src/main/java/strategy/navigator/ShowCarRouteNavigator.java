package strategy.navigator;

public class ShowCarRouteNavigator extends Navigator {

    private Strategy strategy;

    public ShowCarRouteNavigator(Strategy strategy) {
        super(strategy);
        this.strategy = strategy;
    }

    @Override
    public void showRoute() {
        strategy.buildRoute();
    }
}
