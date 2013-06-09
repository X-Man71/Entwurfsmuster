package view;

import java.awt.Dimension;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import modell.IModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import controller.IController;
import entities.CategorieAndValue;
import entities.Transaction;

public class Graph implements ViewKomponente
{
	private IController controller;
	private IModel model;
	private JFrame graphJFrame;
	private DefaultCategoryDataset dataset = new DefaultCategoryDataset();;

	public Graph(IController controller, IModel model)
	{
		this.controller = controller;
		this.model = model;
		model.registObserver(this);
	}

	@Override
	public void createView()
	{
		graphJFrame = new JFrame();
		JFreeChart chart = ChartFactory.createBarChart("Bar Chart Demo", // chart
																			// title
				"Ausgaben", // domain axis label
				"Value", // range axis label
				dataset, // data
				PlotOrientation.VERTICAL, // orientation
				true, // include legend
				true, // tooltips
				false // URLs
				);
		ChartPanel chartPanel = new ChartPanel(chart, false);
		chartPanel.setPreferredSize(new Dimension(500, 270));
		graphJFrame.setContentPane(chartPanel);

		graphJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graphJFrame.pack();
		graphJFrame.setTitle("Graph");
		graphJFrame.setVisible(true);

		updateView();

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateView()
	{
		List<CategorieAndValue> categorieAndValueList = new ArrayList<CategorieAndValue>();
		List<String> listCage = new ArrayList<String>();

		for (int i = dataset.getRowCount() - 1; i >= 0; i--)
		{
			dataset.removeRow(i);
			
		}
		for (int i = dataset.getColumnCount() - 1; i >= 0; i--)
		{
			dataset.removeColumn(i);
			
		}
	
		for (Transaction tran: model.getTransaktions())
		{			
			if(!listCage.contains(tran.getCategorie()))
			{ 
				//Kategorie noch nicht vorhanden
				listCage.add(tran.getCategorie());
				CategorieAndValue categorieAndValue = new CategorieAndValue();
				categorieAndValue.setAmount(tran.getAmount());
				categorieAndValue.setCategorie(tran.getCategorie());
				categorieAndValueList.add(categorieAndValue);
			}	
			else
			{
				//Kategorie bereits vorhanden
				for (int i = 0; i < categorieAndValueList.size(); i++) 
				{
				    if(categorieAndValueList.get(i).getCategorie().equals(tran.getCategorie()))
				    {
				    	BigDecimal bigDecimal;
				    	bigDecimal = categorieAndValueList.get(i).getAmount();
				    	bigDecimal = bigDecimal.add(tran.getAmount());
				    	
				       CategorieAndValue cat = new CategorieAndValue();
				       cat.setAmount(bigDecimal);
				       cat.setCategorie(tran.getCategorie());
				       categorieAndValueList.set(i, cat);
				    }
				}
				
			}
		}
		
		for (CategorieAndValue categorieAndValue1 : categorieAndValueList)
		{
			//System.out.println(categorieAndValue1.getCategorie());
			dataset.addValue(categorieAndValue1.getAmount(), categorieAndValue1.getCategorie(),
					categorieAndValue1.getCategorie());
			
		}
	}

	
}
