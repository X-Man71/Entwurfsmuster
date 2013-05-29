package Fabrik.Berlin;

import Fabrik.PizzaZutatenFabrik;
import Zutaten.Artischoken;
import Zutaten.Gemuese;
import Zutaten.Karotten;
import Zutaten.Krabben;
import Zutaten.Kaese;
import Zutaten.Oberschienen;
import Zutaten.Salami;
import Zutaten.Sosse;
import Zutaten.Teig;
import Zutaten.Thunfisch;

public class BerlinerPizzaZutatenFabrik implements PizzaZutatenFabrik
{
	
	

	@Override
	public Teig erstelleTeig()
	{
		return new TeigMitDuennerKruste();
	}

	@Override
	public Sosse erstelleSoße()
	{
		return new MarinadeSosse();
	}

	@Override
	public Kaese erstelleKaese()
	{
		return new Parmesan();
	}

	@Override
	public Salami erstelleSalami()
	{
		return new PferdeSalami();
	}

	@Override
	public Gemuese[] erstelleGemuese()
	{
		Gemuese gemüse[] = {new Oberschienen(), new Artischoken(), new Karotten()}; 
		return gemüse;
	}

	@Override
	public Thunfisch erstelleThunfisch()
	{
		return new ThunfischAusDerDose();
	}

	@Override
	public Krabben erstelleKrabben()
	{
		return new FrischeKrabben();
	}

	

}
