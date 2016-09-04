package factory;

/**
 * Created by Gurinder on 9/4/2016.
 */
public class Main {
    public static void main(String[] args) {
        GenreFactory factory = new GenreFactory();
        MusicGenre musicGenre1 = factory.getMusicGenre("Heavy metal");
        musicGenre1.musicType();
        MusicGenre musicGenre2 = factory.getMusicGenre("Punk");
        musicGenre2.musicType();
        MusicGenre musicGenre3 = factory.getMusicGenre("Classical");
        musicGenre3.musicType();
    }
}
