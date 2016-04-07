package strategy;

/**
 * Created by gurinder on 7/4/16.
 */
public class Quack implements Quackable {
    @Override
    public void quack() {
        System.out.println("Yes i do quack");
    }
}
