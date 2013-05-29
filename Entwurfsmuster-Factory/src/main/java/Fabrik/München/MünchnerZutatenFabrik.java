package Fabrik.München;

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
import Fabrik.PizzaZutatenFabrik;

public class MünchnerZutatenFabrik implements PizzaZutatenFabrik
{

	@Override
	public Teig erstelleTeig()
	{
		return new TeigMitFesterKruste();
	}

	@Override
	public Soße erstelleSoße()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Käse erstelleKäse()
	{
		return new AlmKäse();
	}

	@Override
	public Salami erstelleSalami()
	{
		return new ScharfeSalami();
	}

	@Override
	public Gemüse[] erstelleGemüse()
	{
		Gemüse gemüse[] = {new Karotten(), new Artischoken(), new Oberschienen()};
		return gemüse;
	}

	@Override
	public Thunfisch erstelleThunfisch()
	{
		return new ThunfischAusDemChiemsee();
	}

	@Override
	public Krabben erstelleKrabben()
	{
		return new GefroreneKrabben();
	}

}
