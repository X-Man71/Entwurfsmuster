package Getränke;

public abstract class Getränk
{
	protected String beschreibung = "unbekanntes Getränk";

	public String getBeschreibung()
	{
		return beschreibung;
	}

	public abstract double preis();
}
