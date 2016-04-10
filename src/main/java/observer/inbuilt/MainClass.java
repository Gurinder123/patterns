package observer.inbuilt;

/**
 * Created by gurinder on 10/4/16.
 */
public class MainClass {

    public static void main(String[] args) throws Throwable {

        User user = new User();
        TimesOfIndiaData data = new TimesOfIndiaData();
        data.addObserver(user);
        data.setChanged();
        data.notifyObservers("msg is this");
    }
}
