package Getraenke;

import java.math.BigDecimal;

import Dekorator.Groesse;


public abstract class Getraenk
{
	protected String beschreibung = "unbekanntes Getränk";	
	
	private Groesse groesse;
	
	public String getBeschreibung()
	{
		return beschreibung;
	}
	
	public void setGroesse(Groesse groesse)
	{
		this.groesse = groesse;
	}
	
	public Groesse getGroesse()
	{
		return groesse;
	}
	
	public abstract BigDecimal preis();
}
