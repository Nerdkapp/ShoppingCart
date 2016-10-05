package com.sales.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.sales.item.Item;

/**
 * This class implements the behavior of the shopping cart:
 * We can: 
 * - add items
 * - print the receipt 
 * 
 * There is no support for multiple items, so any added item will be considered as unique.
 */

public class ShoppingCart {
	private List<Item> items;
	private BigDecimal totalPrice;
	private BigDecimal totalTaxes;
	
	public ShoppingCart() {
		items = new ArrayList<Item>();
		totalPrice = BigDecimal.ZERO;
		totalTaxes = BigDecimal.ZERO;
	}
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public void printReceipt(){
		String receipt = "";
		for(Item i : items){
			receipt += i + "\n";
			totalPrice = totalPrice.add(i.getPrice().add(i.getTaxes()));
			totalTaxes = totalTaxes.add(i.getTaxes());
		}
		
		receipt += "Sales taxes: " + totalTaxes + "\n";
		receipt += "Total: " + totalPrice + "\n";
		System.out.println(receipt);
	}
}
