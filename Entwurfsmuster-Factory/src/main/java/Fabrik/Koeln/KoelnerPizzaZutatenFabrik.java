package Fabrik.Koeln;

import Zutaten.Gemuese;
import Zutaten.Karotten;
import Zutaten.Krabben;
import Zutaten.Kaese;
import Zutaten.Oberschienen;
import Zutaten.Salami;
import Zutaten.Sosse;
import Zutaten.Teig;
import Zutaten.Thunfisch;
import Fabrik.PizzaZutatenFabrik;

public class KoelnerPizzaZutatenFabrik implements PizzaZutatenFabrik
{

	@Override
	public Teig erstelleTeig()
	{
		return new TeigMitSehrDünnerKruste();
	}

	@Override
	public Sosse erstelleSoße()
	{
		return new BruchettaSosse();
	}

	@Override
	public Kaese erstelleKaese()
	{
		return new KoelnerZiegenKäse();
	}

	@Override
	public Salami erstelleSalami()
	{
		return new GrobeSalami();
	}

	@Override
	public Gemuese[] erstelleGemuese()
	{
		Gemuese gemüse[] = {new Oberschienen(), new Karotten()};
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
