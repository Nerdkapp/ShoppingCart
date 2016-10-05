package com.sales.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtils {
	
	private static BigDecimal roundTo;
	
	static{
		roundTo = new BigDecimal("0.05");
	}
	
	/*
	 *  rounded up to the nearest 0.05
	 */
	public static BigDecimal round(BigDecimal value) {
		BigDecimal divided = value.divide(roundTo, 0, RoundingMode.UP);
		return divided.multiply(roundTo);
	}
}
