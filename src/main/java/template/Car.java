package template;

abstract public class Car {

    public void start(){
        accelerate();
    }

    protected abstract void accelerate();
}
