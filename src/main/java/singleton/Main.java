package singleton;

import java.io.*;
import java.lang.ref.WeakReference;

/**
 * Created by gurinder on 16/6/16.
 */
public class Main {
    public final static void main(String[] args) {

        WeakReference<Main> weakReference = new WeakReference<>(new Main());
        weakReference.get();
        EagerIntializerSingleTon enumBasedSingleton = EagerIntializerSingleTon.getInstance();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/home/gurinder/cat.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(enumBasedSingleton);
            System.out.println(enumBasedSingleton);
            FileInputStream fileInputStream = new FileInputStream("/home/gurinder/cat.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            EagerIntializerSingleTon enumBasedSingleton1 = (EagerIntializerSingleTon) objectInputStream.readObject();
            System.out.println(enumBasedSingleton1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
