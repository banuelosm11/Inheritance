package rotatearray;

import java.net.NoRouteToHostException;
import java.util.ArrayList;

/**
 * Created by aurorabanuelos on 5/2/17.
 */
public class ExtendArray extends ArrayList {

    public static void rotateAmount (ExtendArray newList, int rotateValue){

        for (int j=0; j < rotateValue; j++);

        newList.add(newList.get(0));
        newList.remove(newList.get(0));

    }
}
