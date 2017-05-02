package rotatearray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by aurorabanuelos on 5/2/17.
 */
public class ArrayOne extends ArrayList {

        public static void main(String[] args) {

            ArrayList rotatedArray = new ArrayList();

            {
                for (int i = 1; i < 7; i++) {
                    rotatedArray.add(i);
                }
            }

            System.out.println("Original " + Arrays.toString(rotatedArray.toArray()));

            //Collections.rotate(rotatedArray, 4);

            System.out.println("Rotated " + Arrays.toString(rotatedArray.toArray()));

        }
    }

