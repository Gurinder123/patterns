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
    public boolean registerSubscriber(Subscriber s) {
        System.out.println("user added");
        return subscriber.add(s);
    }

    @Override
    public boolean removeSubscriber(Subscriber s) {
        boolean flag = false;
        int pos = subscriber.indexOf(s);
        if (pos >= 0) {
            System.out.println("user removed");
            return subscriber.remove(s);
        }
        return flag;
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
