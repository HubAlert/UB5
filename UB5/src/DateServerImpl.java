
//rmi services need to be hosted in a server process. 
//The Naming class provides methods to get and store the remote object by the server
import java.rmi.*;
import java.rmi.server.*;
import java.util.Date;
import java.util.*;

/*Implementation of the remote interface. https://www.javatpoint.com/RMI
 *Therefore we need to extend the UnicastRemoteObject class
*/
public class DateServerImpl extends UnicastRemoteObject implements DateServer {
  public DateServerImpl () throws RemoteException {
	  super();	//you must define a constructor that declares RemoteException.
  }
  
Basket b; //object reference
Item i; 
//String[] r;

public Date getDate () throws RemoteException {
    System.out.println("Invocation of getDate()");
    return new Date ();
  }

public void addItem(String itemname, double price, int quantity) throws RemoteException {
	System.out.println("Invocation of addItem of Basket ()");
	b.addItem(itemname, price, quantity);
}
//@Override
public DateItemInterface getItemByName(String n) throws RemoteException {
	System.out.println("Invocation of @Override of getItembyName of Basket ()");
	Item db[] = new Item[2];	
	DateItemInterface iteminterface = null;
	db = b.getItemByName(n);
	//db = b.getItemByName(n);
	return iteminterface;
}

//	//System.out.println ("ItemName: " + Arrays.toString(getNameofItem()));
//	//String n = "";

/*
@Override
public DateItemInterface getItemByName(String n) throws RemoteException {
	System.out.println("Invocation of @Override of getItembyName of Basket ()");
	Item db[] = new Item[2];	
	DateItemInterface iteminterface;
	iteminterface = db[0];
	return iteminterface;
}
a class derived from an interface would be accepted anywhere the interface was accepted*/
/*
@Override
	public DateItemInterface getItemByName(String n) throws RemoteException {
		System.out.println("Invocation of @Override of getItembyName of Basket ()");
		Item db[] = new Item[2];	
		DateItemInterface iteminterface;
		iteminterface = db[0];
		return iteminterface;
}
*/
/*
public Item getItemByName(String n) throws RemoteException {
	System.out.println("Invocation of getItembyName of Basket ()");
	Item it = b.getItemByName(n);
    System.out.println ("ItemName: " + it.getNameofItem());
	return it;
  }
*/
/*
@Override
	public Product find(Integer id) throws NoSuchProductException {
		if(id == db[0].hashCode())
		{
		x = db[0];
		return x;	
			
		}*/

public void describeItems() {
	System.out.println("Invocation of describeItems () of Basket ()");	
	b.describeItems();
}

public String getName() throws RemoteException {
	System.out.println("Invocation of getName of Basket ()");
	return b.getName();
	}

public String[] getItemNames() throws RemoteException {
	System.out.println("Invocation of getItemNames () of Basket ()");
	  //HashSet<Item> items = new HashSet<Item>();
	//int i = 0;
	String s[];
	//HashSet <Item> items = new HashSet();
	//for(i = 0; i < s.length; i++) {
		s = b.getItemNames();  
	  //}
		System.out.println(Arrays.toString(s));
	return s;
}

//Next step is to create stub and skeleton objects using the rmi compiler 
  
  public static void main (String[] args) {
    try {
      DateServerImpl dateServer = new DateServerImpl ();	//stub dateServer initialised 
      Naming.rebind ("DateServer", dateServer);//Binding the remote object by the name DateServer
      //server registers remote objects by binding them to a name
      System.out.println("Server is up");
      
      dateServer.b = new Basket("Kosar");
      
      //DemoClass myObj = new DemoClass();
      //myObj.myMethod();
   
	
    } catch (Exception e) {
		System.out.println("DateServerImpl: " + e.getMessage());
		e.printStackTrace();
	}
  }
};







































/*
Basket b; //létrejött egy Basket objektumokra mutatni képes referencia, ami pill üres, nem mutat sehova - egy osztályváltozó, ami nem is létezik, amíg létre nem hozom az osztályt, amíg nem írom le hogy new addig nincs is objektum
	//java-ban minden referencia, kivéve a primitív adattípusokat (int, float, stb)
*/
/*
class GFG {
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<String>();
        set.add("1");
        set.add("13");
        set.add("27");
        set.add("87");
        set.add("19");
  
        System.out.println("Hash Set Contains :" + set);
        String arr[] = new String[set.size()];
        
        // toArray() method converts the set to array
        set.toArray(arr);
  
        for (String n : arr)
            System.out.println(n);
    }
}


*/















/*public String[] getItemNames () throws RemoteException {
	String[] d = new String[4];
	d = b.getItemNames();
	System.out.println("Invocation of getItemNames in all Baskets ()");	
	return d;
}
*/

/*
public String getNameofItem() {
	System.out.println("Invocation of getNameofItem () of Item");	
	String m = getNameofItem();
	return m;
}
*/

/*public double getPrice() {
//Item items = new HashSet<Item>(); //I store Item in items: 
Item items; //annak az egy kosárnak az összes Itemjét komplett objektumokat az árral, stb együtt
System.out.println("Invocation of getPrice () of Item");	
double p = 0;
int c = 0;
for(Item i: items) {
	p = i.getPrice();
	return p;
}
}
*/


/*
class ObjectReturnDemo {
    int a;
 
    // Constructor
    ObjectReturnDemo(int i) { a = i; }
 
    // Method returns an object
    ObjectReturnDemo incrByTen()
    {
        ObjectReturnDemo temp
            = new ObjectReturnDemo(a + 10);
        return temp;
    }
}*/

/*
  public HashSet<Item> getItems(){
  System.out.println("Invocation of getItems () of Basket ()");
  HashSet<Item> items = new HashSet<Item>();
  Object[] ob = items.toArray();
	int i = 0;
  	for(Item a : items) {
		//for (int i = 0; i < ob.length; i++) {
			ob[i++] = b.getItems();
			System.out.println(ob[i]);
  //}
   }
	  return items;
  }
  */
  /*String[] a = new String[items.size()];
	int c = 0;
	for(Item i: items) {
		a[c++] = i.getNameofItem();
	}
	return a;//random
	}*/
/* 
public HashSet<Item> getItems(){
	System.out.println("Invocation of getItems () of Basket ()");
    HashSet<Item> i = new HashSet<Item> ();
    for (Item a: b.getItems()) {
    	System.out.println("Items of b" + b.getItems());
    }
	return i;
}
*/
/*
public HashSet<Item> getItems() {//annak az egy kosárnak az összes Itemjét komplett objektumokat az árral, stb együtt
	 return items;
	}
*/
//@Override //in Player.java
//public String toString() {
//public class HashSetStringToString {
/*	public HashSet<Item> getItems(){	
	System.out.println("Invocation of getItems () of Basket ()");
	//Set set = new HashSet<>();
	HashSet<Item> items = new HashSet<Item> ();
    String[] stringArray = new String[b.getItems()];
    //arrayString = b.getItems();
    //for (Item a: b.getItems()) {
    // b.getItems().toString();
    for (Item i : items) {
    	arrayString = b.getItems();
    	System.out.println("Items of b" + b.getItems().toString());
    	System.out.println(i);
    	//return i.toString();
    }
    //return i;
	return b.getItems();
}*/
/*
	String[] stringArray = new String[stringSet.Count];
	stringSet.CopyTo(stringArray);
	*/
/*public class HashSetStringToString {
	public static void main(String[] args) {
		Set set = new HashSet();
 
		set.add("vinod");
		set.add("kamal");
		set.add("anand");
 
		String[] arrayString = (String[]) set.toArray(new String[set.size()]);
		for (String s : arrayString) {
 
			System.out.println(s);
		}
 
	}*/
//}
/*//in Main.java:
HashSet<Player> p = team1.getAllItems();
for(Player player: p) {
	System.out.println(player.toString());
}

@override //in Player.java
public String toString() {
	return playerName + position + Integer.toString(age);
}
https://www.geeksforgeeks.org/overriding-tostring-method-in-java/
*/
	/*
public HashSet<Item> getItems(){
	HashSet<Item> i = b.getItems();
	for (Item a: b.getItems()) {
//    HashSet<Item> i = dateServer.getItems();
//    System.out.println("getItems of the basket: " + i);
    System.out.println(a.getNameofItem() + b.getName() + a.getPrice());
    }
	return i;
}
*/
