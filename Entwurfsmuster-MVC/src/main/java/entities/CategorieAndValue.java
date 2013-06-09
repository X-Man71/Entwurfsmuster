package entities;

import java.math.BigDecimal;

public class CategorieAndValue
{
	private String categorie;
	
	private BigDecimal amount;

	public String getCategorie()
	{
		return categorie;
	}

	public void setCategorie(String categorie)
	{
		this.categorie = categorie;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}
	
	
}
