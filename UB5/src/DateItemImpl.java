import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
import java.rmi.server.*;


public class DateItemImpl extends UnicastRemoteObject implements DateItemInterface {
  public DateItemImpl () throws RemoteException {
	  super();										//constructor that declares RemoteException.
  }

 Item i; 											//object reference
 
 public String getNameofItem() throws RemoteException {
		System.out.println("Invocation of getNameofItem ()");
		return i.getNameofItem();
		}
 
 public double getPrice() throws RemoteException  {
	System.out.println("Invocation of getPrice ()");
	double p = i.getPrice();
	return p;
 	}
 
 public int getQuantity() throws RemoteException {
	System.out.println("Invocation of getQuantity ()");
	int i = getQuantity();
	return i;
 	}
 
 public void setQuantity(int quantity) throws RemoteException {
	System.out.println("Invocation of setQuantity ()");
	i.setQuantity(quantity);
 	}

 
 public static void main (String[] args) {
	    try {
	      DateItemImpl itemServer = new DateItemImpl ();	//stub itemServer initialised 
	      Naming.rebind ("ItemServer", itemServer);//Binding the remote object by the name itemServer
	      //server registers remote objects by binding them to a name
	      System.out.println("ItemServer is up");
	      
	      itemServer.i = new Item ("Banane");
	      
		
	    } catch (Exception e) {
			System.out.println("DateItemImpl: " + e.getMessage());
			e.printStackTrace();
		}
	  }
	};






  
