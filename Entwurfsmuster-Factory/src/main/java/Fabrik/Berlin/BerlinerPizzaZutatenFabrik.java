package Fabrik.Berlin;

import Fabrik.PizzaZutatenFabrik;
import Zutaten.Artischoken;
import Zutaten.Gemüse;
import Zutaten.Karotten;
import Zutaten.Krabben;
import Zutaten.Käse;
import Zutaten.Oberschienen;
import Zutaten.Salami;
import Zutaten.Soße;
import Zutaten.Teig;
import Zutaten.Thunfisch;

public class BerlinerPizzaZutatenFabrik implements PizzaZutatenFabrik
{
	
	

	@Override
	public Teig erstelleTeig()
	{
		return new TeigMitDünnerKruste();
	}

	@Override
	public Soße erstelleSoße()
	{
		return new MarinadeSoße();
	}

	@Override
	public Käse erstelleKäse()
	{
		return new Parmesan();
	}

	@Override
	public Salami erstelleSalami()
	{
		return new PferdeSalami();
	}

	@Override
	public Gemüse[] erstelleGemüse()
	{
		Gemüse gemüse[] = {new Oberschienen(), new Artischoken(), new Karotten()}; 
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
