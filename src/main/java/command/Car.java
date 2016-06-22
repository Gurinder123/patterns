package command;

/**
 * Created by Gurinder on 6/17/2016.
 */
public class Car {

    private int another;


    private boolean carStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (another != car.another) return false;
        return carStatus == car.carStatus;

    }

    @Override
    public int hashCode() {
        int result = another;
        result = 31 * result + (carStatus ? 1 : 0);
        return result;
    }

    public void switchOn() {
        carStatus = true;
        System.out.println("Car is currently ON is" + carStatus);
    }

    public void switchOff() {
        carStatus = false;
        System.out.println("Car is currently ON is" + carStatus);
    }
}
