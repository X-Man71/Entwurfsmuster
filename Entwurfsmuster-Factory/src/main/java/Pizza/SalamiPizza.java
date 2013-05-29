package Pizza;

import Fabrik.PizzaZutatenFabrik;

public class SalamiPizza extends Pizza
{
	PizzaZutatenFabrik zutatenFabrik;
	
	public SalamiPizza(PizzaZutatenFabrik zutatenFabrik)
	{
		this.zutatenFabrik = zutatenFabrik;
	}

	@Override
	public void vorbereiten()
	{
		System.out.println("Mache "+name);
		teig = zutatenFabrik.erstelleTeig();
		soße = zutatenFabrik.erstelleSoße();
		salami = zutatenFabrik.erstelleSalami();
		käse = zutatenFabrik.erstelleKäse();
		
	}

}
