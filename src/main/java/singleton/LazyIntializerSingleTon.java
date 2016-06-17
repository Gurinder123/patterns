package singleton;

/**
 * Created by gurinder on 16/6/16.
 */
public class LazyIntializerSingleTon {
    private static volatile LazyIntializerSingleTon LAZY_INTIALIZER_SINGLE_TON;

    private LazyIntializerSingleTon() {
    }

    public static LazyIntializerSingleTon getInstance() {
        if (LAZY_INTIALIZER_SINGLE_TON == null) {
            synchronized (LazyIntializerSingleTon.class) {
                LAZY_INTIALIZER_SINGLE_TON = new LazyIntializerSingleTon();
            }
        }
        return LAZY_INTIALIZER_SINGLE_TON;
    }

}
