package observer.Domain;

import observer.Display;
import observer.Subject;
import observer.Subscriber;

/**
 * Created by gurinder on 10/4/16.
 */
public class User2 implements Subscriber, Display {
    private String msg;
    private Subject subject;

    public User2(Subject subject) {
        this.subject = subject;
        subject.registerSubscriber(this);
    }

    @Override
    public void display() {
        System.out.println(this.getClass() + " got news " + msg);
    }

    @Override
    public void pushMessage(String msg) {
        this.msg = msg;
        display();
    }
}
