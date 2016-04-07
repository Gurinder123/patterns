package strategy;

/**
 * Created by gurinder on 7/4/16.
 */
public class QuackMute implements Quackable {
    @Override
    public void quack() {
        System.out.println("I am always mute");
    }
}
