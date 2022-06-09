import java.rmi.*;
import java.util.Arrays;
import java.util.Date;

public class DateItemClient {
  public static void main (String[] args) throws Exception {
    if (args.length != 1)
      throw new IllegalArgumentException ("Syntax: DateClient <hostname>");    
    try {
      
      DateItemImpl itemServer = (DateItemImpl) Naming.lookup
 		        ("rmi://" + args[0] + "DateItemImpl");/*Getting the stub object by the lookup() method of the Naming class and
 		         									*invoking the method on this object. */ 	
 		
 	  String name = itemServer.getNameofItem();
       	System.out.println ("Itemname: " + name);

      double p = itemServer.getPrice();
         System.out.println ("Item price: " + p);
       
      int q = itemServer.getQuantity();
         System.out.println ("Item quality: " + q);
       
      int quant = 0;
       itemServer.setQuantity(quant);
         System.out.println ("Item quality changed.");
       	
     } catch (Exception e) {
 		System.out.println("DateClient: " + e.getMessage());
 	    e.printStackTrace();
 	}
     
   }
 }
    

	//public String getNameofItem() throws RemoteException; 									//<= Return the name 
	//public double getPrice() throws RemoteException;											//<=	Return the price
	//public int getQuantity() throws RemoteException;											//<=	Return the quantity 
	//public void setQuantity(int quantity) throws RemoteException;	











