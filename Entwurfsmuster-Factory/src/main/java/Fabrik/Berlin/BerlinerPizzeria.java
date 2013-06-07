package Fabrik.Berlin;

import Fabrik.PizzaZutatenFabrik;
import Fabrik.Pizzeria;
import Pizza.KrabbenPizza;
import Pizza.Pizza;
import Pizza.SalamiPizza;
import Pizza.ThunfischPizza;
import Pizza.VegetarischePizza;

public class BerlinerPizzeria extends Pizzeria
{
	/**
	 * Typ der Pizza die erstellt werden soll kann als String übergeben werden.
	 */
	@Override
	protected Pizza erstellePizza(String item)
	{
		/*
		 * Es werden Zutatenfabriken erstellt, diese verwenden alle das gemeinsame Interface.
		 * Es gibt aber für jeden Standort eine andere Fabrik.
		 * Diese Fabriken werden in die Pizzaklassen übergeben.
		 * Diese Fabriken beinhalten die eigenarten eines Standorts, mit Dünner Kruste oder ähnliches.
		 */
		
		Pizza pizza = null;
		PizzaZutatenFabrik zutatenFabrik = 
			new BerlinerPizzaZutatenFabrik();
		
 
		if (item.equals("Salami")) {
  
			pizza = new SalamiPizza(zutatenFabrik);
			pizza.setName("Salami-Pizza Berliner Art");
  
		} else if (item.equals("Vegetarisch")) {
 
			pizza = new VegetarischePizza(zutatenFabrik);
			pizza.setName("Vegetarische Pizza Berliner Art");
 
		} else if (item.equals("Krabben")) {
 
			pizza = new KrabbenPizza(zutatenFabrik);
			pizza.setName("Krabben-Pizza Berliner Art");
 
		} else if (item.equals("Thunfisch")) {

			pizza = new ThunfischPizza(zutatenFabrik);
			pizza.setName("ThunfischPizza Berliner Art");
 
		} 
		return pizza;
	}

	

}
