package com.sales.origin;

import java.math.BigDecimal;

import com.sales.utils.MathUtils;

public class ImportedItem implements Origin{
	
	//Standard tax rate for imported items is 5%
	@Override
	public BigDecimal importationCost(BigDecimal itemPrice) {
//		return itemPrice.multiply(new BigDecimal("0.05"), MathUtils.getMC());
		return MathUtils.round(itemPrice.multiply(new BigDecimal("0.05")));
	}
}
