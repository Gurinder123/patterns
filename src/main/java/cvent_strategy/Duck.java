package cvent_strategy;

/**
 * Created by gurinder on 16/6/16.
 */
public abstract class Duck {
    private Swimmable swim;
    private Quackable quack;
    private Singable sing;

    public Duck(Swimmable swim, Quackable quack, Singable sing) {
        this.swim = swim;
        this.quack = quack;
        this.sing = sing;
    }

    abstract public void display();
}
