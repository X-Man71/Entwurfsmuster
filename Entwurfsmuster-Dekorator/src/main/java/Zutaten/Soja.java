package Zutaten;

import Getränke.Getränk;

public class Soja extends ZutatenDekorierer
{
	private Getränk getränk;
	
	public Soja(Getränk getränk)
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
		// TODO Auto-generated method stub
		return 0.15 + getränk.preis();
	}

}
