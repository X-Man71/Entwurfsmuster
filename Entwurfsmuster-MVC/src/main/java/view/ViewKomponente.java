package view;

import modell.Observer;
import entities.Transaction;

public interface ViewKomponente extends Observer
{	
	public void add(Transaction transaktion);
	
	public void remove(Transaction transaktion);
	
	public void removeTransactionByIndex(int row);
	
	public void updateView();
	
	public abstract void createView();
}
