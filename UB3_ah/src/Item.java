//A shopping item should have methods with the following functionality: 
//Return the name, the price, the quantity 
//Change the quantity
import java.io.Serializable;

public class Item implements Serializable {
//Klassenelemente
    private String name;
    private double price;
    private int quantity; 
//Konstruktor
    public Item() {
    }
    
    public Item (String name) {
        this.name = name;
    }

    public Item (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
 //Get- und Set-Methoden:
    public void setName(String newname) {
    	this.name = newname;
    }
    
    public void setPrice(float newprice) {
    	this.price = newprice;
    }
    
    public String getNameofItem() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String describe() {
    	String d = "Item: name " + this.name + ", price " + this.price + ", quantity " + this.quantity;
    	return d;
    };
}
