package Fabrik;

import Zutaten.Gemuese;
import Zutaten.Krabben;
import Zutaten.Kaese;
import Zutaten.Salami;
import Zutaten.Sosse;
import Zutaten.Teig;
import Zutaten.Thunfisch;

public interface PizzaZutatenFabrik
{
	public Teig erstelleTeig();
	
	public Sosse erstelleSoße();
	
	public Kaese erstelleKaese();
	
	public Salami erstelleSalami();
	
	public Gemuese[] erstelleGemuese();
	
	public Thunfisch erstelleThunfisch();
	
	public Krabben erstelleKrabben();
	
}
