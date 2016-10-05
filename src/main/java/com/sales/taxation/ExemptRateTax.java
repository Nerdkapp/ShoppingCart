package com.sales.taxation;

import java.math.BigDecimal;

public class ExemptRateTax implements Taxation {

	@Override
	public BigDecimal taxes(BigDecimal itemPrice) {
		return BigDecimal.ZERO;
	}
}
