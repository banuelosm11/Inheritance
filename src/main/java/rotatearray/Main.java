package rotatearray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aurorabanuelos on 5/1/17.
 */
public class RotatedArray extends ArrayList {

    public static void main(String[] args) {

        ArrayList rotatedArray = new ArrayList();

        {
            for (int i = 1; i < 7; i++) {
                rotatedArray.add(i);
            }
        }

        System.out.println("Original " + Arrays.toString(rotatedArray.toArray()));

        //Collections.rotate(rotator, 4);
        ExtendArray.rotateValue(rotatedArray, 2);



        System.out.println("Rotated " + Arrays.toString(rotatedArray.toArray()));

    }
}
