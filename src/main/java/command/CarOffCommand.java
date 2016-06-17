package command;

/**
 * Created by Gurinder on 6/17/2016.
 */
public class CarOffCommand implements Command {

    private Car car;

    public CarOffCommand(Car car) {
        this.car = car;
    }


    @Override
    public void execute() {
        car.switchOff();
    }
}
