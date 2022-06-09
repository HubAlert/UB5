import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface DateServer extends Remote {
  public Date getDate () throws RemoteException; 
  public void addItem(String itemname, double price, int quantity) throws RemoteException;
  public DateItemInterface getItemByName(String n) throws RemoteException;
  public void describeItems() throws RemoteException;
  public String getName () throws RemoteException;
  public String[] getItemNames() throws RemoteException;

}

//Sie müssen DateItemInterface zurückgeben und nicht Item
//Und wenn Sie implementieren Sie müssen als entsprechende Set oder Arrays zurückgeben
 
//a class derived from an interface would be accepted anywhere the interface was accepted

/*. Therefore, you have to transform the objects of the classes 
shopping basket and shopping item into remote objects. 
All shopping basket- and shopping item objects exist only on the server! 

For each shopping item there exists a separate object. 
Similar to the description in Sheet 3, we require that each shopping basket has two private attributes:
a name and a set of shopping item objects. 

This set should represent the shopping items that belong to the shopping basket.
(Note that it is a set of objects and not just a number!) Each shopping item has three private 
attributes: a unique name, a price and a quantity. 

A shopping basket have methods with the following functionality. 

- Item getItembyName(String n) <= Search for a shopping item with a particular name. You can assume that there exists at most 
one. The method returns a reference to the corresponding shopping item object.					<=	getItemByName
- void addItem(String itemname, float price, int quantity) <= Add a shopping item to a shopping basket. The method has three parameters: the name of the 
item, the price and the quantity. A corresponding shopping item object is created and added to 
the set of items of the shopping basket 														<=	addItem
- void describeItems() <= Return the set of all item objects of the shopping basket. (The return value has to be a 
collection of references to shopping item objects and not just a number!) 						<=	HashSet<Item> getItems()	nem getItemNames
- String getName () <= Return the name of the shopping basket. 														<=	getName

All these methods can be invoked from the client. 

A shopping item should have methods with the following functionality. All these methods can be 
invoked from the client. 
- String getItemByName <= String getNameofItem() <= Return the name 
- void describeItems() <= double getPrice()	<=	Return the price
- void describeItems() <= int getQuantity()	<=	Return the quantity 
- setQuantity(int quantity)	<=	Change the quantity 
*/

//public HashSet<Item> getItems() throws RemoteException;


//Returning of Objects

































/*
public class BasketExtra extends Basket {
	private String nameExtra;
    //private HashSet<Item> itemsExtra = new HashSet<Item>();

    public BasketExtra () {
	nameExtra = name;
	}
    
    public BasketExtra (string nameExtra) {
	nameExtra = name;
	} 
    
    public String toString() {
	return super.toString() + " nameExtra " + nameExtra;
	} 
}
*/
/*
public String getNameofItem() throws RemoteException;
*/
/*
public String[] getItemNames () throws RemoteException;
*/