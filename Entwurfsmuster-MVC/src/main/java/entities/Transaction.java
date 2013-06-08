package entities;

import java.math.BigDecimal;

public class Transaction
{
	private String description;
	
	private BigDecimal amount;
	
	private String Categorie;

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

	public String getCategorie()
	{
		return Categorie;
	}

	public void setCategorie(String categorie)
	{
		Categorie = categorie;
	}
	
	
}
