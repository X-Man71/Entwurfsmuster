package Zutaten;

import java.math.BigDecimal;

import Dekorator.Groesse;
import Getraenke.Getraenk;

public class Schoko extends ZutatenDekorierer
{
	private Getraenk getraenk;

	public Schoko(Getraenk getraenk)
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
		
		BigDecimal preis = new BigDecimal("0.20");
		if (getGroesse() != null)
		{
			switch (getGroesse())
			{
			case Tall:
				preis = new BigDecimal("0.15");
				break;
			case Grande:
				preis = new BigDecimal("0.20");
				break;
			case Venti:
				preis = new BigDecimal("0.25");
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
