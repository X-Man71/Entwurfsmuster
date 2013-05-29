package Zutaten;

import java.math.BigDecimal;

import Dekorator.Groesse;
import Getraenke.Getraenk;

public class Soja extends ZutatenDekorierer
{
	private Getraenk getraenk;

	public Soja(Getraenk getraenk)
	{
		this.getraenk = getraenk;
	}

	@Override
	public String getBeschreibung()
	{
		return getraenk.getBeschreibung() + ", Schoko";
	}

	@Override
	public BigDecimal preis()
	{
		BigDecimal preis = new BigDecimal("0.15");
		if (getGroesse() != null)
		{
			switch (getGroesse())
			{
			case Tall:
				preis = new BigDecimal("0.10");
				break;
			case Grande:
				preis = new BigDecimal("0.15");
				break;
			case Venti:
				preis = new BigDecimal("0.20");
				break;
			}
		}

		return preis = preis.add(getraenk.preis());
	}

	@Override
	public Groesse getGroesse()
	{
		return getraenk.getGroesse();
	}

}
