package Dekorator;

import Getränke.DunkleRöstung;
import Getränke.Espresso;
import Getränke.Getränk;
import Getränke.Hausmischung;
import Zutaten.Milchschaum;
import Zutaten.Schoko;
import Zutaten.Soja;


public class Main
{

	public static void main(String[] args)
	{
		Getränk getränk = new Espresso();
		System.out.println(getränk.getBeschreibung()+" "+getränk.preis()+" €");

		Getränk getränk2 = new DunkleRöstung();
		getränk2.setGröße(Größe.Venti);
		getränk2 = new Schoko(getränk2);
		getränk2 = new Schoko(getränk2);
		getränk2 = new Milchschaum(getränk2);
		System.out.println(getränk2.getBeschreibung()+" "+getränk2.preis()+ " €");
		
		Getränk getränk3 = new Hausmischung();
		getränk3 = new Soja(getränk3);
		getränk3 = new Schoko(getränk3);
		getränk3 = new Milchschaum(getränk3);
		System.out.println(getränk3.getBeschreibung()+" "+getränk3.preis()+ " €");
	}

}
