package observer.inbuilt;

import java.util.Observable;

/**
 * Created by gurinder on 10/4/16.
 */
public class TimesOfIndiaData extends Observable {
    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }
}
