package singleton;

/**
 * Created by gurinder on 16/6/16.
 */
public class StaticBlockSingleTon {
    private static volatile StaticBlockSingleTon staticBlockSingleTon;

    static {
        staticBlockSingleTon = new StaticBlockSingleTon();
    }

    public static StaticBlockSingleTon getInstance() {
        return staticBlockSingleTon;
    }
}
