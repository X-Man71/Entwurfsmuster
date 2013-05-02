package Zutaten;

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
	public double preis()
	{
		return 0.20 + getränk.preis();
	}

}
