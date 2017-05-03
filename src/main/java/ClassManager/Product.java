package ClassManager;

/**
 * Created by aurorabanuelos on 5/2/17.
 */
public class Product {

    private String id;
    private double price;
    private int quantity;



    public Product (String id, double price, int quantity){
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }



    public String getId(){
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

}
