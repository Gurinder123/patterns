package IterableForEachPattern;

import java.util.Iterator;

/**
 * Created by Gurinder on 9/4/2016.
 */
public class BandIterator<E> implements Iterable<E> {
    private int index;
    private Object[] listofBands = new Object[10];
    private int count;

    public boolean add(E data) {
        listofBands[index++] = data;
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        count = 0;
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                if (index > count)
                    return true;
                else
                    return false;
            }

            @Override
            public E next() {
                return (E) listofBands[count++];
            }
        };
    }

}
