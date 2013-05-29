package Fabrik;

import Zutaten.Gemüse;
import Zutaten.Krabben;
import Zutaten.Käse;
import Zutaten.Salami;
import Zutaten.Soße;
import Zutaten.Teig;
import Zutaten.Thunfisch;

public interface PizzaZutatenFabrik
{
	public Teig erstelleTeig();
	
	public Soße erstelleSoße();
	
	public Käse erstelleKäse();
	
	public Salami erstelleSalami();
	
	public Gemüse[] erstelleGemüse();
	
	public Thunfisch erstelleThunfisch();
	
	public Krabben erstelleKrabben();
	
}
