package com.ss.day5.assignment;

import java.util.function.Function;

public class Lambda {
	static Function<Integer, String> isOdd() {
		return n -> n % 2 == 0 ? "even" : "odd";
	}
	
	static Function<Integer, String> isPrime() {
		return n -> { 
			for(int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					return "composite";
				}
			}
			return "prime";
		};
	}
	
	static Function<Integer, String> isPalindrome() {
		return n -> {
			String num = String.valueOf(n);
			String reverse = new StringBuilder(num).reverse().toString();
			return num.equals(reverse) ? "palindrome" : "not a palindrome";
		};
	}
}
