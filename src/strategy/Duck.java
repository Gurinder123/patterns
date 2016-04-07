package strategy;

/**
 * Created by gurinder on 7/4/16.
 */
public abstract class Duck {
    private Flyable fly;
    private Quackable quack;

    public Duck(Flyable fly, Quackable quack) {
        this.fly = fly;
        this.quack = quack;
    }

    public abstract void display();

}
