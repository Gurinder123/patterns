package cvent_strategy;

/**
 * Created by gurinder on 16/6/16.
 */
public class OriginalDuck extends Duck {
    private Swimmable swim;
    private Quackable quack;
    private Singable sing;

    public OriginalDuck(Swimmable swim, Quackable quack, Singable sing) {
        super(swim, quack, sing);
        this.swim = swim;
        this.quack = quack;
        this.sing = sing;
    }


    @Override
    public void display() {
        swim.swim();
        quack.quack();
        sing.sing();
    }
}
