package Zutaten;

import Getränke.Getränk;

public class Milchschaum extends ZutatenDekorierer
{
	private Getränk getränk;
	
	public Milchschaum(Getränk getränk)
	{
		this.getränk = getränk;
	}

	@Override
	public String getBeschreibung()
	{
		return getränk.getBeschreibung() + ", Milchschaum";
	}

	@Override
	public double preis()
	{
		return 0.10 + getränk.preis();
	}

}
