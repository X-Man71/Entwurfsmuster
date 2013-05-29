package Fabrik.München;

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
import Fabrik.PizzaZutatenFabrik;

public class MuenchnerZutatenFabrik implements PizzaZutatenFabrik
{

	@Override
	public Teig erstelleTeig()
	{
		return new TeigMitFesterKruste();
	}

	@Override
	public Sosse erstelleSoße()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kaese erstelleKaese()
	{
		return new AlmKaese();
	}

	@Override
	public Salami erstelleSalami()
	{
		return new ScharfeSalami();
	}

	@Override
	public Gemuese[] erstelleGemuese()
	{
		Gemuese gemüse[] = {new Karotten(), new Artischoken(), new Oberschienen()};
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
