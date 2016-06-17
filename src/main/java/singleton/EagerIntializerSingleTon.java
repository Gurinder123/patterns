package singleton;

import java.io.Serializable;

/**
 * Created by gurinder on 16/6/16.
 */
public class EagerIntializerSingleTon implements Serializable {
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    private int val;
    private static final EagerIntializerSingleTon EAGER_INTIALIZER_SINGLE_TON = new EagerIntializerSingleTon();

    private EagerIntializerSingleTon() {
    }

    public static EagerIntializerSingleTon getInstance() {
        return EAGER_INTIALIZER_SINGLE_TON;
    }

    protected Object readResolve() {
        return EAGER_INTIALIZER_SINGLE_TON;
    }
}
