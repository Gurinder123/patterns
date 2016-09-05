package decorator.subway.breads;

import decorator.subway.Sub;
import decorator.subway.SubDecorator;

/**
 * Created by Gurinder on 9/5/2016.
 */
public class HoneyOat extends SubDecorator {
    private Sub sub;

    public HoneyOat(Sub sub) {
        this.sub = sub;
    }

    @Override
    public String getDescription() {
        return sub.getDescription() + " ,HoneyOat";
    }

    @Override
    public double cost() {
        return sub.cost() + 20;
    }
}
