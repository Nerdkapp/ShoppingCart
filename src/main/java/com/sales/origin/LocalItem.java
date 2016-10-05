package com.sales.origin;

import java.math.BigDecimal;

public class LocalItem implements Origin {

	@Override
	public BigDecimal importationCost(BigDecimal price) {
		return BigDecimal.ZERO;
	}

}
