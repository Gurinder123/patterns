package IterableForEachPattern;

/**
 * Created by Gurinder on 9/4/2016.
 */
public class Main {
    public static void main(String[] args) {
        BandIterator<String> band = new BandIterator<>();
        band.add("Megadeth");
        band.add("Metallica");
        band.add("Anthrax");
        band.add("Slayer");
        for (String str : band) {
            System.out.println(str);
        }

    }
}
