package template;

public class Fiat extends Car {

    @Override
    protected void accelerate() {
        System.out.println("Slow");
    }
}
