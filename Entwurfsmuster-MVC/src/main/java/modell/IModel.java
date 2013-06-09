package modell;

import java.util.List;

import entities.Transaction;

public interface IModel
{
	void registObserver(Observer o);
	
	void removeObserver(Observer o);
	
	void add(Transaction transaktion);
	
	void remove(Transaction transaktion);
	
	void removeTransactionByIndex(int i);
	
	List<Transaction> getTransaktions();
}
