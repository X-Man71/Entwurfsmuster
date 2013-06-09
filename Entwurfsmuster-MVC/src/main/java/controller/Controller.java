package controller;

import view.Graph;
import view.Table;
import view.ViewKomponente;
import modell.IModel;
import entities.Transaction;

public class Controller implements IController
{
	private IModel model;
	private ViewKomponente tableView;
	private ViewKomponente graphView;
	
	public Controller(IModel model)
	{
		this.model = model;
		tableView = new Table(this, model);
		tableView.createView();
		graphView = new Graph(this, model);
		graphView.createView();
	}

	@Override
	public void add(Transaction transaction)
	{
		model.add(transaction);
		
	}

	@Override
	public void remove(Transaction transaction)
	{
		model.add(transaction);
		
	}

	@Override
	public void removeTransactionByIndex(int row)
	{
		model.removeTransactionByIndex(row);
		
	}

}
