package strategy.navigator;

abstract public class Navigator {

    private Strategy strategy;

    public Navigator(Strategy strategy) {
        this.strategy = strategy;
    }

    public abstract void showRoute();

}
