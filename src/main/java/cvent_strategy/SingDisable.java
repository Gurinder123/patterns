package cvent_strategy;

/**
 * Created by gurinder on 16/6/16.
 */
public class SingDisable implements  Singable {
    @Override
    public void sing() {
        System.out.println("Dont sing");
    }

}
