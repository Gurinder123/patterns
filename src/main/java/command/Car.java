package command;

/**
 * Created by Gurinder on 6/17/2016.
 */
public class Car {

    private int another;


    private boolean carStatus;

    public void switchOn() {
        carStatus = true;
        System.out.println("Car is currently ON is" + carStatus);
    }

    public void switchOff() {
        carStatus = false;
        System.out.println("Car is currently ON is" + carStatus);
    }
}
