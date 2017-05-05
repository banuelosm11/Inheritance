package ClassManager;

/**
 * Created by aurorabanuelos on 5/2/17.
 */
public class Product {

    private String id;
    private double price;
    private int quantity;
    private double totalValue;


    public Product(String id, double price, int quantity){
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.totalValue = this.price * this.quantity;
    }


    public String getId(){
        return id;
    }

    public double getPrice() {return price;}

    public int getQuantity() {
        return quantity;
    }

    public double getTotalValue(){
        return totalValue;
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
