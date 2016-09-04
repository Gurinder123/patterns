package iterator_pattern;

import java.util.Iterator;

/**
 * Created by Gurinder on 9/4/2016.
 */
public class BandIterator implements Iterator<String> {
    private int index;
    private Bands[] listofBands = Bands.getBandNames();

    @Override
    public boolean hasNext() {
        if (listofBands.length > index)
            return true;
        else
            return false;
    }

    @Override
    public String next() {
        return listofBands[index++].getName();
    }
}
