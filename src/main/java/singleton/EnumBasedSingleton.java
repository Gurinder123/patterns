package singleton;

/**
 * Created by gurinder on 16/6/16.
 */
public enum EnumBasedSingleton {
    INSTANCE(1);

    public int val;

    private EnumBasedSingleton(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public static EnumBasedSingleton getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("yes it can be done");
    }
}
