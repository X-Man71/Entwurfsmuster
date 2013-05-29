package main;

import Fabrik.Pizzeria;
import Fabrik.Berlin.BerlinerPizzeria;
import Fabrik.Koeln.KoelnerPizzeria;
import Pizza.Pizza;


public class RunPizzeria
{
	public static void main(String [] args)
	{
		Pizzeria berlinPizzeria = new BerlinerPizzeria();
		Pizzeria kölnerPizzeria = new KoelnerPizzeria();
 
		Pizza pizza = berlinPizzeria.bestellePizza("Salami");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = kölnerPizzeria.bestellePizza("Salami");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");

		pizza = berlinPizzeria.bestellePizza("Krabben");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = kölnerPizzeria.bestellePizza("Krabben");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");

		pizza = berlinPizzeria.bestellePizza("Thunfisch");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = kölnerPizzeria.bestellePizza("Thunfisch");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");

		pizza = berlinPizzeria.bestellePizza("Vegetarisch");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = kölnerPizzeria.bestellePizza("Vegetarisch");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");
	}
}
