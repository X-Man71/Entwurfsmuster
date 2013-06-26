package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Server.Adder;

public class Client
{
	public static void main(String[] args) throws NotBoundException, IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Bitte eingabe: ");
		String eingabe = br.readLine();
		Registry registry = LocateRegistry.getRegistry();
		Adder adder = (Adder) registry.lookup("Adder");
		System.out.println("Vom Server zurückgeliefert "+adder.add(eingabe));
	}
}
