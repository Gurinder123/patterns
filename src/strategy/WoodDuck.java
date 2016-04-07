package strategy;

/**
 * Created by gurinder on 7/4/16.
 */
public class WoodDuck extends Duck {
    private Flyable fly;
    private Quackable quack;

    public WoodDuck(Flyable fly, Quackable quack) {
        super(fly, quack);
        this.fly = fly;
        this.quack = quack;
    }

    @Override
    public void display() {
        fly.fly();
        quack.quack();
    }
}
