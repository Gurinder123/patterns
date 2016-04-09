package observer;

/**
 * Created by gurinder on 9/4/16.
 */
public interface Subject {
    void registerSubscriber(Subscriber s);

    void removeSubscriber(Subscriber s);

    void notifySubscriber();

}
