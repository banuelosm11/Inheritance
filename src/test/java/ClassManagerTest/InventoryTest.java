package ClassManagerTest;

import ClassManager.Inventory;
import ClassManager.Product;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/2/17.
 */
public class InventoryTest {

    @Test
    public void testTotalValueByProduct(){
    //Given
        double [] totalValue = {3.00, 4.25, 5.00};
        Inventory products = new Inventory();

    //When
        double actualResult = products.sumValueOfAllProducts(totalValue);
        double expectedResult = 12.25;

    //Then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testQuantitySumOfAllProducts(){
        //Given
        int [] quantityOnHand = {3, 4, 2};
        Inventory products = new Inventory();

        //When
        int actualResult = products.quantitySumOfAllProducts(quantityOnHand);
        int expectedResult = 9;

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testTotalValueById() {
        //Given
        int quantityOnHand = 3;
        double price = 1.00;
        Inventory product = new Inventory();

        //When
        double actualResult = product.totalValueById(quantityOnHand, price);
        double expectedResult = 3.00;

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

}
