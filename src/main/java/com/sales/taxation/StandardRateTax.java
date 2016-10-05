package com.sales.taxation;

import java.math.BigDecimal;

import com.sales.utils.MathUtils;

public class StandardRateTax implements Taxation {
	@Override
	public BigDecimal taxes(BigDecimal itemPrice) {
		return MathUtils.round(itemPrice.multiply(new BigDecimal("0.10")));
	}
}
