package rotatearray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static rotatearray.Rotator.rotateAmount;

/**
 * Created by aurorabanuelos on 5/1/17.
 */
public class MyArray extends Rotator{

    public static void main(String[] args) {

        ArrayList rotatedArray = new ArrayList();

        {
            for (int i = 1; i < 7; i++) {
                rotatedArray.add(i);
            }
        }

        System.out.println("Original " + Arrays.toString(rotatedArray.toArray()));

        //Collections.rotate(rotatedArray, 4);
        rotateAmount(rotatedArray, 4);



        System.out.println("Rotated " + Arrays.toString(rotatedArray.toArray()));

    }
}
