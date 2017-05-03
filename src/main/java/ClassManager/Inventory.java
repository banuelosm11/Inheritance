package ClassManager;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/2/17.
 */
public class Inventory {

    public int quantityOfAllProducts (int [] idQuantities){

        int totalQuantity = 0;

        for(int i = 0; i < idQuantities.length; i++){

            totalQuantity += idQuantities[i];

        }

        return totalQuantity;

    }

    public double valueOfAllProducts ( double [] idValues){

        double totalValue = 0.00;

        for(int i=0; i < idValues.length; i++){

            totalValue += idValues[i];
        }

        return totalValue;
    }


}
