package com.sales.item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
	private List<Item> items;
	
	private BigDecimal salesTaxes;
	private BigDecimal total;
	
	public Receipt() {
		items = new ArrayList<Item>();
		salesTaxes = BigDecimal.ZERO;
		total = BigDecimal.ZERO;
	}

	public void printReceipt() throws Exception{
		if(items == null || items.isEmpty()){
			throw new Exception("No items in the basket");
		}else{
			for(Item i : items){
				System.out.println(i);
				salesTaxes = salesTaxes.add(i.getTaxes());
				total = total.add(i.getPrice());
			}
			System.out.println(salesTaxes);
			System.out.println(total);
		}
	}
	
	public void addItem(Item i){
		items.add(i);
	}
}
