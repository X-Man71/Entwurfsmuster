package view;

import java.awt.Dimension;

import javax.swing.JFrame;

import modell.IModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import controller.IController;
import entities.Transaction;

public class Graph implements ViewKomponente
{
	private IController controller;
	private IModel model;
	private JFrame graphJFrame;
	
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
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(1.0, "Row 1", "Column 1");
		dataset.addValue(5.0, "Row 1", "Column 2");
		dataset.addValue(3.0, "Row 1", "Column 3");
		dataset.addValue(2.0, "Row 2", "Column 1");
		dataset.addValue(3.0, "Row 2", "Column 2");
		dataset.addValue(2.0, "Row 2", "Column 3");
		JFreeChart chart = ChartFactory.createBarChart(
		"Bar Chart Demo", // chart title
		"Category", // domain axis label
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
	
	}

	@Override
	public void updateView()
	{
	
	}

	
	
	
}
