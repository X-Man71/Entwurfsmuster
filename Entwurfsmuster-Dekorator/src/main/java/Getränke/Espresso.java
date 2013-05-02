package Getränke;

import java.math.BigDecimal;

public class Espresso extends Getränk
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
