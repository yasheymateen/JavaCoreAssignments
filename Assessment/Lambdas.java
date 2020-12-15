/**
 * Assessment covering Lambdas, functional interfaces, streams and datetime
 */
package com.ss.assessment.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yashe
 *
 */
public class Lambdas {
	public List<String> arr;
	
	public Lambdas(String ...arr) {
		this.arr = Arrays.asList(arr);
	}
	
	public void setStrings(String ...arr) {
		this.arr = Arrays.asList(arr);
	}
	
	public List<String> getStrings() {
		return arr;
	}
	
	public void sort() {
		this.arr.sort((str1, str2) -> str1.length() - str2.length());
	}
	
	public void reverseSort() {
		this.arr.sort((str1, str2) -> str2.length() - str1.length());
		
	}
	
	public void alphabSort() {
		this.arr.sort((str1, str2) -> str1.toLowerCase().charAt(0) - str2.toLowerCase().charAt(0));
	}
	
	private static int stringsWithE(String str1, String str2) {
		int s1 = str1.contains("e") ? 1 : 0;
		int s2 = str2.contains("e") ? 1 : 0;
		return s2 - s1;
	}
	
	public void sortByE () {
		this.arr.sort((str1, str2) -> stringsWithE(str1, str2));
	}
	
	public String evenOddList(Integer ...nums) {
		return Arrays.asList(nums)
				.stream().
				map(num -> (num % 2 != 0 ? "o" : "e") + num)
				.collect(Collectors.joining(","));
	}
	public List<String> threeCharStringsA(List<String> strs) {
		return strs.stream()
				.filter(str -> str.charAt(0) == 'a' && str.length() == 3)
				.collect(Collectors.toList());
	}
}
