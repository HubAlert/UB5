/*A shopping basket should have methods with the following functionality: 
Search for an item with a particular name. You can assume that there exists at most one. The 
method returns the corresponding shopping item object. 
Add a new item to a shopping basket. Three parameters: the name of the item, 
the price and the quantity. A corresponding shopping item object is created and added to the 
set of items of the shopping basket. 
Return the set of all item objects of the shopping basket. (The return value has to be a 
collection of item objects and not just a number!) 
Return the name of the shopping basket. */
//package ;
import java.util.HashSet;
		
public class Basket {
    private String name;
    private HashSet<Item> items = new HashSet<Item>(); //I store Item in items: 
    									//Create a HashSet object called items that will store Item
    									//so I can store more pl. kenyér Item in a Basket <=> name kann ich nur eine
//Konstruktor:  							
    public Basket (String name) {
    	this.name = name;
    }
/*Search for an item with a particular name f.e. Brot. You can assume that there exists at most one. The
    method returns the corresponding shopping item object.*/
    public Item getItemByName(String name) {
    	for(Item a : items) {
    		if(a.getNameofItem().equals(name)) {
    			return a;
}
}
    	return null;
}
/*Add a new item to a shopping basket. The method has three parameters: the name of the item, 
the price and the quantity. A corresponding shopping item object is created and added to the 
set of items of the shopping basket.*/

public void addItem(String name, double price, int quantity) {
	items.add(new Item(name, price, quantity)); //ich gebe neue Items mit derenParametern als Objekte
												//mit Memorieplatz dazu
}
//Return the name of the shopping basket. 

public String getName() {
 return name;
}

public HashSet<Item> getItems() {//annak az egy kosárnak az összes Itemjét komplett objektumokat az árral, stb együtt
 return items;
}

public void describeItems() {
	System.out.println("Basket: " + name);
	for (Item i: items) {
		System.out.println(i.describe());
	}
}

public String[] getItemNames() {
	String[] a = new String[items.size()];
	int c = 0;
	for(Item i: items) {
		a[c++] = i.getNameofItem();
	}
	return a;//random
	}
}

//class basket item-ekkel,amik egy hashset-be vannak beletéve - azért hashsetbe, mert nem tudjuk mennyi lesz belöle
//egy array-ban meg kellene adnom hány item-em van
//class: item a, item b - mindig 1 db a-m és 1 db b-m lesz mindegyik objektben

    

