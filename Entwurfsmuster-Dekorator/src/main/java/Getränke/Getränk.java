package Getränke;

import java.math.BigDecimal;

import Dekorator.Größe;

public abstract class Getränk
{
	protected String beschreibung = "unbekanntes Getränk";	
	
	private Größe größe;
	
	public String getBeschreibung()
	{
		return beschreibung;
	}
	
	public void setGröße(Größe größe)
	{
		this.größe = größe;
	}
	
	public Größe getGröße()
	{
		return größe;
	}
	
	public abstract BigDecimal preis();
}
