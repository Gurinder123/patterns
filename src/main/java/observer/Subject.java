package observer;

/**
 * Created by gurinder on 9/4/16.
 */
public interface Subject {
    boolean registerSubscriber(Subscriber s);

    boolean removeSubscriber(Subscriber s);

    void notifySubscriber();

}
