package com.ss.day5.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class LambdaTest {
	static final List<Function<Integer, String>> ops = List.of(Lambda.isOdd(), Lambda.isPrime(), Lambda.isPalindrome());
	
	
	@Test
	public void isOddtest() {
		var isOdd = Lambda.isOdd();
		
		assertEquals("odd", isOdd.apply(7));
		assertEquals("even", isOdd.apply(18));
	}
	
	@Test
	void testIsPrime()

}
