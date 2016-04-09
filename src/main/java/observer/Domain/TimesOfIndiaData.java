package observer.Domain;

import observer.Subject;
import observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gurinder on 10/4/16.
 */
public class TimesOfIndiaData implements Subject {

    private List<Subscriber> subscriber;
    private String msg;

    public TimesOfIndiaData() {
        subscriber = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber s) {
        subscriber.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        int pos = subscriber.indexOf(s);
        if (pos >= 0)
            subscriber.remove(s);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber s : subscriber) {
            s.pushMessage(msg);
        }
    }

    public void setMessage(String msg) {
        this.msg = msg;
        notifySubscriber();
    }
}
