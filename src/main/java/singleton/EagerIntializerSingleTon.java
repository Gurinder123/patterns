package singleton;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by gurinder on 16/6/16.
 */
public class EagerIntializerSingleTon implements Serializable {

    @Setter
    @Getter
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
