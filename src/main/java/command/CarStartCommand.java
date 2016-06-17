package command;

/**
 * Created by Gurinder on 6/17/2016.
 */
public class CarStartCommand implements Command {

    private Car car;

    public CarStartCommand(Car car) {
        this.car = car;
    }


    @Override
    public void execute() {
        car.switchOn();
    }
}
