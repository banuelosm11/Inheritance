package ClassManager;

import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/2/17.
 */
public class Main {


    public static void main(String[] args) {

        Manager manager = new Manager();

        Product[] products = new Product[3];
        products[0] = new Product("bananas", 1.00, 3);
        products[1] = new Product("apples", 2.00, 2);
        products[2] = new Product("carrots", 1.00, 3);

        manager.inventoryReport(products);

    }


}
