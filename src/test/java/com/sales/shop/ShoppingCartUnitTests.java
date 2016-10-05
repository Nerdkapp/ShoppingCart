package com.sales.shop;

import org.junit.Test;

import com.sales.item.Item;
import com.sales.origin.ImportedItem;
import com.sales.origin.LocalItem;
import com.sales.taxation.ExemptRateTax;
import com.sales.taxation.StandardRateTax;

public class ShoppingCartUnitTests {

	@Test
	public void test1(){
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Item("12.49", "Book", new ExemptRateTax(), new LocalItem()));
		cart.addItem(new Item("14.99", "Music CD", new StandardRateTax(), new LocalItem()));
		cart.addItem(new Item("0.85", "Chocolate bar", new ExemptRateTax(), new LocalItem()));
		cart.printReceipt();
	}
	
	@Test
	public void test2(){
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Item("10", "Imported box of Chocolate", new ExemptRateTax(), new ImportedItem()));
		cart.addItem(new Item("47.50", "Imported bottle of perfume", new StandardRateTax(), new ImportedItem()));
		cart.printReceipt();
	}
	
	@Test
	public void test3(){
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Item("27.99", "Imported bottle of perfume", new StandardRateTax(), new ImportedItem()));
		cart.addItem(new Item("18.99", "Bottle of perfume", new StandardRateTax(), new LocalItem()));
		cart.addItem(new Item("9.75", "Packet of headcache pills", new ExemptRateTax(), new LocalItem()));
		cart.addItem(new Item("11.25", "Box of chocolates", new ExemptRateTax(), new ImportedItem()));
		cart.printReceipt();
	}
}
