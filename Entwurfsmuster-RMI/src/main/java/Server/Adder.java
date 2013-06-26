package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Adder extends Remote
{
	String add(String eingabe) throws RemoteException;
}
