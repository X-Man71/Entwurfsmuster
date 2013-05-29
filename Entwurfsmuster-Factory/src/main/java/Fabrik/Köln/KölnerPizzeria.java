package Fabrik.Köln;

import Fabrik.PizzaZutatenFabrik;
import Fabrik.Pizzeria;
import Fabrik.Berlin.BerlinerPizzaZutatenFabrik;
import Pizza.KrabbenPizza;
import Pizza.Pizza;
import Pizza.SalamiPizza;
import Pizza.ThunfischPizza;
import Pizza.VegetarischePizza;

public class KölnerPizzeria extends Pizzeria
{
	@Override
	protected Pizza erstellePizza(String item)
	{
		Pizza pizza = null;
		PizzaZutatenFabrik zutatenFabrik = 
			new BerlinerPizzaZutatenFabrik();
 
		if (item.equals("Salami")) {
  
			pizza = new SalamiPizza(zutatenFabrik);
			pizza.setName("Mit Grobe Salami");
  
		} else if (item.equals("Vegetarisch")) {
 
			pizza = new VegetarischePizza(zutatenFabrik);
			pizza.setName("Vegetarische Pizza Berliner Art");
 
		} else if (item.equals("Krabben")) {
 
			pizza = new KrabbenPizza(zutatenFabrik);
			pizza.setName("Krabben Pizza mit Scampi");
 
		} else if (item.equals("Thunfisch")) {

			pizza = new ThunfischPizza(zutatenFabrik);
			pizza.setName("ThunfischPizza Thunfisch frisch aus der Ostsee");
 
		} 
		return pizza;
	}
}
