package entities;

import java.math.BigDecimal;

public class Transaction
{
	private int id;
	
	private String description;
	
	private BigDecimal amount;
	
	private String Categorie;
	

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

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

	@Override
	public String toString()
	{
		return "Transaction [description=" + description + ", amount=" + amount
				+ ", Categorie=" + Categorie + "]";
	}
	
	
	
	
}
