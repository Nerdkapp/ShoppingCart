package com.sales.taxation;

import java.math.BigDecimal;

public interface Taxation {
	public BigDecimal taxes(BigDecimal itemPrice);
}
