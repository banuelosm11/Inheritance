package rotatearray;

import java.util.ArrayList;

/**
 * Created by aurorabanuelos on 5/2/17.
 */
public class Rotator {


        public static void rotateAmount (ArrayList newList,int rotateValue){

            for (int j = 0; j < rotateValue; j++) ;

            newList.add(newList.get(0));
            newList.remove(newList.get(0));

        }

}

