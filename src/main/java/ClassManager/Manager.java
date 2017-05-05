package ClassManager;

/**
 * Created by aurorabanuelos on 5/2/17.
 */
public class Manager {


    public void inventoryReport(Product [] currentProducts ){

    double valueOfAllInventory = 0.00;
    int quantityOfAllInventory = 0;

        for(Product p: currentProducts) {

            valueOfAllInventory += p.getTotalValue();
            quantityOfAllInventory += p.getQuantity();

            System.out.println("Product id: " + p.getId() + " " + "Price: " + p.getPrice() + " " + "Quantity: " + p.getQuantity());
        }

        System.out.println();
        System.out.println("Value of all inventory: " + valueOfAllInventory );
        System.out.println("Quantity of all inventory: " + quantityOfAllInventory );




    }


}
