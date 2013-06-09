package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import modell.IModel;
import controller.IController;
import entities.Transaction;

public class Table implements ActionListener, ViewKomponente, MouseListener
{
	private IController controller;
	private IModel model;
	private JFrame tableJFrame;
	private JTable tableJTable;
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
		tableJTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableJTable.addMouseListener(this);
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
	public void removeTransactionByIndex(int row)
	{
		controller.removeTransactionByIndex(row);
		
	}
	
	

	@Override
	public void updateView()
	{
		for (int i = defaultTableModel.getRowCount() - 1; i >= 0; i--)
		{
			defaultTableModel.removeRow(i);
		}

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

	@Override
	public void mouseClicked(MouseEvent e)
	{		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		int row = tableJTable.rowAtPoint(e.getPoint());
		this.removeTransactionByIndex(row);	
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
	}

	

}
