package observer.inbuilt;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by gurinder on 10/4/16.
 */
public class User implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg + " received");
    }


}
