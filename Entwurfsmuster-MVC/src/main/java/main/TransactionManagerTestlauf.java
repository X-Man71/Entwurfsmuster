package main;

import controller.Controller;
import controller.IController;
import modell.IModel;
import modell.Model;

public class TransactionManagerTestlauf
{
	public static void main(String[] args)
	{
		IModel model = new Model();
		IController controller = new Controller(model);
	}
}
