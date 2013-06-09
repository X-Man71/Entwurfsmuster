package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import entities.Transaction;

public class FormTransaction extends JPanel
{
	private static final long serialVersionUID = 1L;

	private JTextField descriptionJTextField = new JTextField("Description");
	private JTextField amountJTextField = new JTextField("Amount");
	private JTextField categorie = new JTextField("Categorie");
	private JButton sendButton = new JButton("Send");

	public FormTransaction()
	{
		JPanel listPane = new JPanel();
		listPane.setLayout(new BoxLayout(listPane, BoxLayout.LINE_AXIS));
		listPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		listPane.add(Box.createHorizontalGlue());
		listPane.add(descriptionJTextField);
		listPane.add(Box.createRigidArea(new Dimension(10, 0)));
		listPane.add(amountJTextField);
		listPane.add(Box.createRigidArea(new Dimension(10, 0)));
		listPane.add(categorie);
		listPane.add(Box.createRigidArea(new Dimension(10, 0)));
		listPane.add(sendButton);
		add(listPane);

	}

	public JButton getButton()
	{
		return sendButton;
	}

	public Transaction getTransaction()
	{
		Transaction transaction = new Transaction();
		transaction.setDescription(descriptionJTextField.getText());
		transaction.setAmount(new BigDecimal(amountJTextField.getText()));
		transaction.setCategorie(categorie.getText());
		return transaction;

	}
}
