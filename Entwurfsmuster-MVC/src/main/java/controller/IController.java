package controller;

import entities.Transaction;

public interface IController
{
	public void add(Transaction transaction);

	public void remove(Transaction transaction);

	public void removeTransactionByIndex(int row);

}
