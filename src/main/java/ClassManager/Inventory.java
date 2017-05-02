package ClassManager;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/2/17.
 */
public class Inventory {

    public int quantitySumOfAllProducts (int [] quantities){

        int totalQuantity = 0;

        for(int i = 0; i < quantities.length; i++){

            totalQuantity += quantities[i];

        }

        return totalQuantity;

    }

    public double sumValueOfAllProducts ( double [] values){

        double totalValue = 0.00;

        for(int i=0; i < values.length; i++){

            totalValue += values[i];
        }

        return totalValue;
    }

    public double totalValueById(int quantityOnHand, double price){

        double valueById = quantityOnHand * price;

        return valueById;

    }

}
