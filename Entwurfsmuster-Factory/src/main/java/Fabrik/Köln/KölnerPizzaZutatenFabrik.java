package Fabrik.Köln;

import Zutaten.Gemüse;
import Zutaten.Karotten;
import Zutaten.Krabben;
import Zutaten.Käse;
import Zutaten.Oberschienen;
import Zutaten.Salami;
import Zutaten.Soße;
import Zutaten.Teig;
import Zutaten.Thunfisch;
import Fabrik.PizzaZutatenFabrik;

public class KölnerPizzaZutatenFabrik implements PizzaZutatenFabrik
{

	@Override
	public Teig erstelleTeig()
	{
		return new TeigMitSehrDünnerKruste();
	}

	@Override
	public Soße erstelleSoße()
	{
		return new BruchettaSoße();
	}

	@Override
	public Käse erstelleKäse()
	{
		return new KölnerZiegenKäse();
	}

	@Override
	public Salami erstelleSalami()
	{
		return new GrobeSalami();
	}

	@Override
	public Gemüse[] erstelleGemüse()
	{
		Gemüse gemüse[] = {new Oberschienen(), new Karotten()};
		return gemüse;
	}

	@Override
	public Thunfisch erstelleThunfisch()
	{
		return new ThunfischAusDerOstsee();
	}

	@Override
	public Krabben erstelleKrabben()
	{
		return new HandgesalzeneKrabben();
	}

}
