package view;

import java.util.ArrayList;

import modell.Observer;

import entities.Transaction;

public abstract class ViewKomponente implements Observer
{
	private ArrayList<Transaction> transaktionsListe = new ArrayList<Transaction>();
	
	public void add(Transaction transaktion)
	{
		transaktionsListe.add(transaktion);
	}
	
	public void remove(Transaction transaktion)
	{
		transaktionsListe.add(transaktion);
	}
	@Override
	public void updateView(){
		
	}
	
	public abstract void createView();
}
