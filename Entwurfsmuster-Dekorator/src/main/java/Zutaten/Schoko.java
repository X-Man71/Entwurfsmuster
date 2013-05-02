package Zutaten;

import java.math.BigDecimal;

import Dekorator.Größe;
import Getränke.Getränk;

public class Schoko extends ZutatenDekorierer
{
	private Getränk getränk;

	public Schoko(Getränk getränk)
	{
		this.getränk = getränk;
	}
	
	@Override
	public String getBeschreibung()
	{
		return getränk.getBeschreibung() + ", Schoko";
	}

	@Override
	public BigDecimal preis()
	{
		
		BigDecimal preis = new BigDecimal("0.20");
		if (getGröße() != null)
		{
			switch (getGröße())
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

		return preis = preis.add(getränk.preis());
	}
	
	@Override
	public Größe getGröße()
	{
		return getränk.getGröße();
	}

}
