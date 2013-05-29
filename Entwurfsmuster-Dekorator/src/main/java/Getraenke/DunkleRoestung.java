package Getraenke;

import java.math.BigDecimal;

public class DunkleRoestung extends Getraenk
{
	public DunkleRoestung()
	{
		beschreibung = "Dunkleröstung";
	}

	@Override
	public BigDecimal preis()
	{
		return new BigDecimal("0.99");
	}

	

}
