package iterator_pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Gurinder on 9/4/2016.
 */
@AllArgsConstructor
public enum Bands {
    METALLICA("METALLICA"), SLAYER("SLAYER"), MEGADETH("MEGADETH"), ANTHRAX("ANTHRAX"), EXODUS("EXODUS");

    @Getter
    private String name;

    public static Bands[] getBandNames() {
        return Bands.values();
    }

    public static BandIterator getIterator() {
        return new BandIterator();
    }
}
