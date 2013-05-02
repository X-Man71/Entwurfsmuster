package Getränke;

import java.math.BigDecimal;

public class DunkleRöstung extends Getränk
{
	public DunkleRöstung()
	{
		beschreibung = "Dunkleröstung";
	}

	@Override
	public BigDecimal preis()
	{
		return new BigDecimal("0.99");
	}

	

}
