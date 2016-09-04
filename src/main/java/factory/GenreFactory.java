package factory;

/**
 * Created by Gurinder on 9/4/2016.
 */
public class GenreFactory {
    public MusicGenre getMusicGenre(String type) {
        if (type.contains("Punk"))
            return new PunkRock();
        else if (type.contains("Heavy"))
            return new HeavyMetal();
        else if (type.contains("Classical"))
            return new Classical();
        return null;
    }
}
