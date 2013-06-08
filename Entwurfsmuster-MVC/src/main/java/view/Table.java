package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modell.IModel;
import controller.IController;
import entities.Transaction;

public class Table extends ViewKomponente
{
	private IController controller;
	private IModel model;
	private JFrame tableJFrame;
	private JTable tableJTable;
	private JPanel tableJPanel;
	private DefaultTableModel defaultTableModel;
	private Container mainContainer;

	public Table(IController controller, IModel model)
	{
		this.controller = controller;
		this.model = model;
		model.registObserver(this);
	}

	@Override
	public void createView()
	{
		tableJFrame = new JFrame();
		mainContainer = tableJFrame.getContentPane();
		tableJFrame.setLayout(new BorderLayout());
		String[] columnNames = { "Beschreibung", "Preis", "Kategorie" };
		defaultTableModel = new DefaultTableModel(columnNames, 0);
		tableJTable = new JTable(defaultTableModel);

		mainContainer.add(new JScrollPane(tableJTable), BorderLayout.NORTH);
		tableJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tableJFrame.pack();
		tableJFrame.setTitle("JTable Beispiel");
		tableJFrame.setVisible(true);
		updateView();
	}

	@Override
	public void add(Transaction transaktion)
	{
		super.add(transaktion);
	}

	@Override
	public void remove(Transaction transaktion)
	{
		super.remove(transaktion);
	}

	@Override
	public void updateView()
	{
		super.updateView();
		for (Transaction transaction : model.getTransaktions())
		{
			defaultTableModel.addRow(new Object[] {
					transaction.getDescription(),
					transaction.getAmount().toString(),
					transaction.getCategorie() });
		}

	}

}
