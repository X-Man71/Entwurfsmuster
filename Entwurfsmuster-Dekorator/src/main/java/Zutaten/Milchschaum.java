package Zutaten;

import java.math.BigDecimal;

import Dekorator.Groesse;
import Getraenke.Getraenk;

public class Milchschaum extends ZutatenDekorierer
{
	private Getraenk getraenk;

	public Milchschaum(Getraenk getraenk)
	{
		this.getraenk = getraenk;
	}

	@Override
	public String getBeschreibung()
	{
		return getraenk.getBeschreibung() + ", Milchschaum";
	}

	@Override
	public BigDecimal preis()
	{
		BigDecimal preis = new BigDecimal("0.10");
		if (getGroesse() != null)
		{
			switch (getGroesse())
			{
			case Tall:
				preis = new BigDecimal("0.05");
				break;
			case Grande:
				preis = new BigDecimal("0.10");
				break;
			case Venti:
				preis = new BigDecimal("0.15");
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
