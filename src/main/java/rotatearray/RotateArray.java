package rotatearray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aurorabanuelos on 5/1/17.
 */
public class RotateArray extends ArrayList {

    public static void main(String[] args) {

        ArrayList rotator = new ArrayList();

        {
            for (int i = 1; i < 7; i++) {
                rotator.add(i);
            }
        }

        System.out.println("Original " + Arrays.toString(rotator.toArray()));

        Collections.rotate(rotator, 4);

        System.out.println("Rotated " + Arrays.toString(rotator.toArray()));

    }
}
