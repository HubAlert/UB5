import java.rmi.*;
import java.util.Arrays;
import java.util.Date;

public class DateClient {
  public static void main (String[] args) throws Exception {
    if (args.length != 1)
      throw new IllegalArgumentException ("Syntax: DateClient <hostname>");    
    try {
      DateServer dateServer = (DateServer) Naming.lookup
        ("rmi://" + args[0] + "/DateServer");/*Getting the stub object by the lookup() method of the Naming class and
         									*invoking the method on this object. */ 
         
      Date when = dateServer.getDate ();//object initialised and for him remote object 
      									//übergeben
  
      //Process gets an object without having access to the class of the object
      	System.out.println ("Date: " + when);
      
      String itemname = "Cola";
      float price = 0;
      int quantity = 0;
      dateServer.addItem(itemname, price, quantity); //vagy (itemname, 3.5f, 2)
      	System.out.println ("Item added with Name, Price, Quality");
      
      String itemname2 = "alma";
      float price2 = 0;
      int quantity2 = 0;
      dateServer.addItem(itemname2, price2, quantity2); //vagy (itemname, 3.5f, 2)
      	System.out.println ("Item added with Name, Price, Quality");
     
      DateItemInterface it = dateServer.getItemByName(itemname2);
      	System.out.println ("ItemName: " + it.getNameofItem());//Serializable
      
/*      Item it2 = dateServer.getItemByName(itemname);
      	System.out.println ("ItemName: " + it2.getNameofItem());
  */    
      dateServer.describeItems();
      	System.out.println ("Items with their parameters in the basket");
      
      String basketname = dateServer.getName();
      	System.out.println ("Basket Name: " + basketname);
      
      String[] s = dateServer.getItemNames();
		System.out.println("getItemNames in the basket" + Arrays.toString(s));    
		
    } catch (Exception e) {
		System.out.println("DateClient: " + e.getMessage());
	    e.printStackTrace();
	}
    
  }
}
/*. Therefore, you have to transform the objects of the classes 
shopping basket and shopping item into remote objects. 
All shopping basket- and shopping itemobjects exist only on the server! 

For each shopping item there exists a separate object. 
Similar to the description in Sheet 3, we require that each shopping basket has two private attributes:
a name and a set of shopping item objects. 
This set should represent the shopping items that belong to the shopping basket.
(Note that it is a set of objects and not just a number!) Each shopping item has three private 
attributes: a unique name, a price and a quantity. 
A shopping basket have methods with the following functionality. All these methods can be invoked 
from the client. 

- Search for a shopping item with a particular name. You can assume that there exists at most 
one. The method returns a reference to the corresponding shopping item object. 
- Add a shopping item to a shopping basket. The method has three parameters: the name of the 
item, the price and the quantity. A corresponding shopping item object is created and added to 
the set of items of the shopping basket 
- Return the set of all item objects of the shopping basket. (The return value has to be a 
collection of references to shopping item objects and not just a number!) 
- Return the name of the shopping basket. 
All these methods can be invoked from the client. 

A shopping item should have methods with the following functionality. All these methods can be 
invoked from the client. 
- Return the name 
- Return the price 
- Return the quantity 
- Change the quantity
*/

/*
 * String nameofitem = dateServer.getNameofItem();
      System.out.println (nameofitem);
 */

 

/*
DateItemImpl itemServer = (DateItemImpl) Naming.lookup
	        ("rmi://" + args[0] + "/itemServer");/*Getting the stub object by the lookup() method of the Naming class and
	         									*invoking the method on this object. */ 	
	/*
String name = itemServer.getNameofItem();
	System.out.println ("Itemname: " + name);

	//public String getNameofItem() throws RemoteException; 									//<= Return the name 
	//public double getPrice() throws RemoteException;											//<=	Return the price
	//public int getQuantity() throws RemoteException;											//<=	Return the quantity 
	//public void setQuantity(int quantity) throws RemoteException;	

double p = itemServer.getPrice();
  System.out.println ("Item price: " + p);

int q = itemServer.getQuantity();
  System.out.println ("Item quality: " + q);

int quant = 0;
itemServer.setQuantity(quant);
  System.out.println ("Item quality changed.");
	*/




























/*String[] s = dateServer.getItemNames();
      System.out.println(s);	//All ItemNames
      */


/*
HashSet<Item> i = dateServer.getItems();
System.out.println ("Items in the basket" + i );
*/
/*HashSet<Item> i = dateServer.getItems();
for(Item a: i) {
//     	System.out.println(i.toString());
    System.out.println(i);
}
*/
/*
for (Item a: b.getItems()) {
HashSet<Item> i = dateServer.getItems();
System.out.println("getItems of the basket: " + i);
System.out.println (a.getNameofItem(), b.getName(), a.getPrice());
}
*/
//double p = dateServer.getPrice();
//System.out.println ("ItemPrice: " + getPrice());






















//Er hat nur überprüft dass alle Methoden im Client aufgerufen sind.