import java.util.HashSet;

public class Main{
	public static void _main(String[] args) {
		
		        Basket b = new Basket("Korb");
		        System.out.printf("Basket`s name is %s.%n", b.getName());

		        b.addItem("Mehl", 1, 1);
		        b.addItem("Öl", 8, 2);
		        b.addItem("Hefe", 2, 10);

		        //return quantity
		        b.getItemByName("Mehl").setQuantity(2);
		        System.out.printf("New Quantity: %,d.%n", b.getItemByName("Mehl").getQuantity());
		        //hogy tudok egy konkrét item-et megszólítani - csak for-Schleife-val az összeset egymás után?
		        //System.out.printf("New Quantity: %s %,d.%n", b.getItemByName("Mehl"), b.getItemByName("Mehl").getQuantity());
		        
		        //total value of all items of the basket
		        float totalValue= 0;
		        for (Item a: b.getItems()) {
		                totalValue += a.getPrice();
		                System.out.printf("The value of %s in the %s is %s €.%n", a.getNameofItem(), b.getName(), a.getPrice());
		        //System.out.printf("The total basketvalue with %s is %f €.%n", a.getName(), totalValue);
		        }
		        System.out.printf("%nThe total basketvalue is %s €.%n", totalValue);
		        
		        //b.getItems();
	}
	

	}
/*//in Main.java:
HashSet<Item> i = b.getItems();
for(Item item: i) {
	System.out.println(i.toString());
}

@override //in Player.java
public String toString() {
	return name + price  + Integer.toString(quantity);
}
*/
