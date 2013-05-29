package Pizza;

import Zutaten.Gemuese;
import Zutaten.Krabben;
import Zutaten.Kaese;
import Zutaten.Salami;
import Zutaten.Sosse;
import Zutaten.Teig;
import Zutaten.Thunfisch;

public abstract class Pizza
{
	public String name;
	
	public Teig teig;
	
	public Sosse soße;
	
	public Salami salami;
	
	public Gemuese gemüse[];
	
	public Kaese käse;
	
	public Thunfisch thunfisch;
	
	public Krabben krabben;
	
	public abstract void vorbereiten();
	
	public void backen(){
		System.out.println("Backe 25 Minuten bei 350");
	}
	
	public void schneiden(){
		System.out.println("Schneide die Pizza diagonal in Stücke");
	}
	public void verpacken(){
		System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public String toString(){
		return "Pizza"
;	}
	
}
