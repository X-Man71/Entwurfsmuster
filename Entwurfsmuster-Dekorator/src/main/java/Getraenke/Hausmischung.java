package Getraenke;

import java.math.BigDecimal;

public class Hausmischung extends Getraenk
{
	public Hausmischung()
	{
		beschreibung = "Hausmischung";	
	}

	@Override
	public BigDecimal preis()
	{
		return new BigDecimal("0.89");
	}

}
