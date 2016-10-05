package com.sales.item;

import java.math.BigDecimal;

import com.sales.origin.Origin;
import com.sales.taxation.Taxation;

public class Item {
	
	//Price and description of the item
	private BigDecimal price;
	private String 	   description;
	
	//Type of taxation
	private Taxation   taxation;
	
	//Origin of the item (it could be imported or local)
	private Origin     origin;
	
	//Calculated amount of taxes
	private BigDecimal taxes;
	
	private Integer quantity;
	
	public Item(String price, String description, Taxation taxation, Origin origin){
		this.price 		 = new BigDecimal(price);
		this.description = description;
		this.taxation	 = taxation;
		this.origin 	 = origin;
		
		this.taxes = taxation.taxes(this.price).add(origin.importationCost(this.price));
	}
	
	@Override
	public String toString() {
		return "1 " + description + " at " + price.add(taxes);
	}
	
	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	public BigDecimal getTaxes() {
		return taxes;
	}

	public void setTaxes(BigDecimal taxes) {
		this.taxes = taxes;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Taxation getTaxation() {
		return taxation;
	}

	public void setTaxation(Taxation taxation) {
		this.taxation = taxation;
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
