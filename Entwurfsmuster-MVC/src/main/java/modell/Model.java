package modell;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import entities.Transaction;

public class Model implements IModel
{
	private List<Observer> listObservers = new ArrayList<Observer>();
	private List<Transaction> listTransactions = new ArrayList<Transaction>();
	
	public Model()
	{
		Transaction transaction1 = new Transaction();
		transaction1.setAmount(new BigDecimal(3));
		transaction1.setCategorie("Nahrungmittel");
		transaction1.setDescription("Brot");
		listTransactions.add(transaction1);
		Transaction transaction2 = new Transaction();
		transaction2.setAmount(new BigDecimal(1));
		transaction2.setCategorie("Nahrungmittel");
		transaction2.setDescription("Wurst");
		listTransactions.add(transaction2);
	}

	@Override
	public void registObserver(Observer o)
	{
		listObservers.add(o);

	}

	@Override
	public void removeObserver(Observer o)
	{
		listObservers.remove(o);
	}

	private void notifyObservers()
	{
		for (Observer o : listObservers)
		{
			o.updateView();
		}
	}

	@Override
	public void add(Transaction transaktion)
	{
		listTransactions.add(transaktion);
		notifyObservers();
	}

	@Override
	public void remove(Transaction transaktion)
	{
		listTransactions.remove(transaktion);
		notifyObservers();
	}

	@Override
	public List<Transaction> getTransaktions()
	{
		List<Transaction> tempListTransactions = listTransactions;
		return tempListTransactions;
	}

}
