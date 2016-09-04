package iterator_pattern;

/**
 * Created by Gurinder on 9/4/2016.
 */
public class Main {
    public static void main(String[] args) {
        BandIterator iterator = Bands.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
