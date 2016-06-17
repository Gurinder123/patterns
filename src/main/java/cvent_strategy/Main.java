package cvent_strategy;

/**
 * Created by gurinder on 16/6/16.
 */
public class Main {
    public final static void main(String[] args) {
        OriginalDuck originalDuck = new OriginalDuck(new SwimEnable(), new QuackEnable(), new SingDisable());
        originalDuck.display();
    }
}
