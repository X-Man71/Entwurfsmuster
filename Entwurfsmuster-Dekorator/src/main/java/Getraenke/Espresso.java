package Getraenke;

import java.math.BigDecimal;

public class Espresso extends Getraenk
{
	public Espresso()
	{
		beschreibung = "Espresso";
	}

	@Override
	public BigDecimal preis()
	{
		return new BigDecimal("1.99") ;
	}

}
