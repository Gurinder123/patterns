package strategy;

/**
 * Created by gurinder on 7/4/16.
 */
public class MainClass {
    public static void main(String[] args) {

        WoodDuck duck = new WoodDuck(new FlyWithNoWings(), new QuackMute());
        duck.display();

    }
}
