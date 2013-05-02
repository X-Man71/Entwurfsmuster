package Getränke;

import java.math.BigDecimal;

public class Hausmischung extends Getränk
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
