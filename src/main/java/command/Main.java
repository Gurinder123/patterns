package command;

/**
 * Created by Gurinder on 6/17/2016.
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Command commandStart = new CarStartCommand(car);
        CarRemote carRemote = new CarRemote();
        carRemote.setCommand(commandStart);
        carRemote.pressButton();
        Command commandStop = new CarOffCommand(car);
        carRemote.setCommand(commandStop);
        carRemote.pressButton();

    }
}
