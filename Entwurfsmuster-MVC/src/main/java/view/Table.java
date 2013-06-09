package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modell.IModel;
import controller.IController;
import entities.Transaction;

public class Table extends ViewKomponente implements ActionListener
{
	private IController controller;
	private IModel model;
	private JFrame tableJFrame;
	private JTable tableJTable;
	private JPanel tableJPanel;
	private DefaultTableModel defaultTableModel;
	private Container mainContainer;
	
	private FormTransaction formTransaction;

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
		formTransaction = new FormTransaction();
		mainContainer.add(formTransaction);
		
		tableJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tableJFrame.pack();
		tableJFrame.setTitle("JTable Beispiel");
		tableJFrame.setVisible(true);
		
		updateView();
		
		formTransaction.getButton().addActionListener(this);
	}

	@Override
	public void add(Transaction transaktion)
	{
		controller.add(transaktion);
	}

	@Override
	public void remove(Transaction transaktion)
	{
		controller.remove(transaktion);
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

	@Override
	public void actionPerformed(ActionEvent e)
	{
		add(formTransaction.getTransaction());	
	}

}
