import java.rmi.RemoteException;
import java.rmi.Remote;


public interface DateItemInterface extends Remote {

 public String getNameofItem() throws RemoteException;
 public double getPrice() throws RemoteException;
 public int getQuantity() throws RemoteException;
 public void setQuantity(int quantity) throws RemoteException;

}























































/*import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.Naming;

*/