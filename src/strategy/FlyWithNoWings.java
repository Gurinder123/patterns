package strategy;

/**
 * Created by gurinder on 7/4/16.
 */
public class FlyWithNoWings implements Flyable {
    @Override
    public void fly() {
        System.out.println("I dont fly");
    }
}
