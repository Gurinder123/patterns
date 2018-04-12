package builder;

import java.util.LinkedHashSet;

/**
 * Created by gurinder on 24/7/16.
 */


public class Main {
    public static void main(String[] args) {
        Employee build = new Employee.Builder().setDept("Computer").setName("Gurinder").setPhone("9873136398").build();

    }


}
