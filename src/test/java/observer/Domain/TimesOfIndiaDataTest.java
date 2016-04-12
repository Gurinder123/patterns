package observer.Domain;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

/**
 * Created by gurinder on 12/4/16.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimesOfIndiaDataTest {
    private static boolean setUpIsDone = false;
    private static User1 sub;

    @Before
    public void init() {
        if (!setUpIsDone) {
            sub = new User1();
            sub.setName("TestUser");
            setUpIsDone = true;
        }
    }


    @Test
    public void testRegisteration() {
        boolean result = UserSingleton.getUser().registerSubscriber(sub);
        assertEquals(true, result);

    }

    @Test
    public void testRemoveSubscriber() {
        boolean result = UserSingleton.getUser().removeSubscriber(sub);
        assertEquals(true, result);
    }


}

class UserSingleton {
    private static TimesOfIndiaData toi;

    static TimesOfIndiaData getUser() {
        if (toi == null) {
            toi = new TimesOfIndiaData();
        }
        return toi;
    }
}
